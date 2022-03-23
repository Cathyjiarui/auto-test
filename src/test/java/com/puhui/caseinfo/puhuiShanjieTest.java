package com.puhui.caseinfo;

import com.puhui.Service.impl.RepayCaseManageServiceImpl;
import com.puhui.Service.impl.RepayDepartmentServiceImpl;
import com.puhui.repay.cloud.api.vo.*;
import com.puhui.utils.TestData;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

/**
 * @ClassName puhuiShanjieTest
 * @Description 测试闪借案件入案
 * @Author JiaZhang
 * @Date 2018/6/19 上午11:16
 * @Version 1.0
 **/
@SpringBootTest
@TestPropertySource("classpath:config.properties")
@Log4j2
public class puhuiShanjieTest extends AbstractTestNGSpringContextTests {

    /**
     * 根据渠道传入参数：
     * SUPERLOAN_OFFLINE 闪借线下 SUPERLOAN_ONLINE 闪借线上
     */
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
    public void PUHUI_SHANJIE_SUPERLOAN_OFFLINE_Test(){

        BaseVo baseVo = testData.getBaseVo("SJ");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("SUPERLOAN_OFFLINE");
        logger.info("请求的url地址是： " + uri + "/api/v1/case/entrustCaseCollection?serviceCode=puhui_shanjie");
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=puhui_shanjie",
                baseVo, EntrustCaseResultVo.class);
        logger.info("响应信息为： " + result.getMessage());
        assertEquals(result.getMessage(),"案件委托成功");
    }

    @Test
    public void PUHUI_SHANJIE_SUPERLOAN_ONLINE_Test(){

        BaseVo baseVo = testData.getBaseVo("SJ");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("SUPERLOAN_ONLINE");
        baseVo.getCaseVo().setStoreId(repayDepartmentService.getUcOrgId(baseVo.getCaseVo().getStoreName()).getUcOrgId());
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=puhui_shanjie",
                baseVo, EntrustCaseResultVo.class);
        assertEquals(result.getMessage(),"案件委托成功");
    }

    @Test
    public void PUHUI_SHANJIE_SUPERLOAN_CONSUME_Test(){

        BaseVo baseVo = testData.getBaseVo("SJ");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("SUPERLOAN_CONSUME");
        baseVo.getCaseVo().setStoreId(repayDepartmentService.getUcOrgId(baseVo.getCaseVo().getStoreName()).getUcOrgId());
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=puhui_shanjie",
                baseVo, EntrustCaseResultVo.class);
        assertEquals(result.getMessage(),"案件委托成功");
    }
}