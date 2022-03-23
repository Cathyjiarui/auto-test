package com.puhui.caseinfo;

import com.puhui.Service.impl.RepayCaseManageServiceImpl;
import com.puhui.Service.impl.RepayDepartmentServiceImpl;
import com.puhui.repay.cloud.api.vo.BaseVo;
import com.puhui.repay.cloud.api.vo.EntrustCaseResultVo;
import com.puhui.utils.TestData;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

/**
 * @ClassName puhuiRenmaiTest
 * @Description 测试任买案件入案
 * @Author JiaZhang
 * @Date 2018/6/19 上午11:08
 * @Version 1.0
 **/
@SpringBootTest
@TestPropertySource("classpath:config.properties")
@Log4j2
public class puhuiRenmaiTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private OAuth2RestTemplate restTemplate;

    @Autowired
    private TestData testData;

    @Autowired
    private RepayDepartmentServiceImpl repayDepartmentService;

    @Autowired
    private RepayCaseManageServiceImpl repayCaseManageService;

    @Value("${entrustCaseCollection.uri}")
    private String uri;

    @Test
    public void PUHUI_RENMAI_P2P_Test(){

        BaseVo baseVo = testData.getBaseVo("RM_COSMESTIC");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("HM_P2P");
        logger.info("请求的url是： " + uri + "/api/v1/case/entrustCaseCollection?serviceCode=puhui_renmai_p2p");
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=puhui_renmai_p2p",
                baseVo, EntrustCaseResultVo.class);
        logger.info("响应信息为：" + result.getMessage());
        assertEquals(result.getMessage(),"案件委托成功");
    }

    @Test
    public void PUHUI_RENMAI_ZHONGAN_Test(){

        BaseVo baseVo = testData.getBaseVo("RM_COSMESTIC");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("HM_ZA_FMYH");
        logger.info("请求的url是： " + uri + "/api/v1/case/entrustCaseCollection?serviceCode=puhui_renmai_p2p");
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=puhui_renmai_zhongan",
                baseVo, EntrustCaseResultVo.class);
        logger.info("响应信息为：" + result.getMessage());
        assertEquals(result.getMessage(),"案件委托成功");
    }

    @Test
    public void PUHUI_RENMAI_YBJR_Test(){

        BaseVo baseVo = testData.getBaseVo("RM_COSMESTIC");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("HM_YBJR");
        logger.info("请求的url是： " + uri + "/api/v1/case/entrustCaseCollection?serviceCode=puhui_renmai_p2p");
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=puhui_renmai_ybjr",
                baseVo, EntrustCaseResultVo.class);
        logger.info("响应信息为：" + result.getMessage());
        assertEquals(result.getMessage(),"案件委托成功");
    }

}