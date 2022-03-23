package com.puhui.caseinfo;

import com.AutoTestApplication;
import com.puhui.Service.impl.RepayCaseManageServiceImpl;
import com.puhui.Service.impl.RepayDepartmentServiceImpl;
import com.puhui.bean.repay.RepayCaseManage;
import com.puhui.mapper.repay.RepayCaseManageMapper;
import com.puhui.repay.cloud.api.vo.BaseVo;
import com.puhui.repay.cloud.api.vo.EntrustCaseResultVo;
import com.puhui.utils.DataConversion;
import com.puhui.utils.HttpUtils;
import com.puhui.utils.TestData;
import lombok.extern.log4j.Log4j2;
import org.json.JSONObject;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * @ClassName puhuiLendTest
 * @Description 测试个贷案件入案
 * @Author JiaZhang
 * @Date 2018/6/19 上午10:51
 * @Version 1.0
 **/
@SpringBootTest
@TestPropertySource("classpath:config.properties")
@Log4j2
public class puhuiLendTest extends AbstractTestNGSpringContextTests {

    private  static  final Logger LOGGER = LoggerFactory.getLogger(AutoTestApplication.class);

    @Autowired
    private OAuth2RestTemplate restTemplate;

    @Autowired
    private TestData testData;

    @Autowired
    private RepayDepartmentServiceImpl repayDepartmentService;

    @Resource
    private RepayCaseManageMapper repayCaseManageMapper;

    @Autowired
    private RepayCaseManageServiceImpl repayCaseManageService;

    @Value("${entrustCaseCollection.uri}")
    private String uri;

    @Test
    public void PUHUI_LEND_GEDAI_Test(){

        BaseVo baseVo = testData.getBaseVo("LEND");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("gedai");
        baseVo.getCaseVo().setStoreId(repayDepartmentService.getUcOrgId(baseVo.getCaseVo().getStoreName()).getUcOrgId());
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=puhui_lend",
                baseVo, EntrustCaseResultVo.class);
        LOGGER.info("返回信息为： " + result.getMessage());
        assertEquals(result.getMessage(),"案件委托成功");
    }

    @Test
    public void PUHUI_LEND_1000_Test(){
        BaseVo baseVo = testData.getBaseVo("LEND");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("1000");
        baseVo.getCaseVo().setStoreId(repayDepartmentService.getUcOrgId(baseVo.getCaseVo().getStoreName()).getUcOrgId());
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=puhui_lend",
                baseVo, EntrustCaseResultVo.class);
        assertEquals(result.getMessage(),"案件委托成功");
    }

    @Test
    public void PUHUI_LEND_OTO_Test(){
        BaseVo baseVo = testData.getBaseVo("LEND");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("gedai");
        baseVo.getCaseVo().setStoreName(null);
        baseVo.getCaseVo().setStoreCity(null);
        baseVo.getCaseVo().setSpecifiedGroup("AGENT_OTO");
        logger.info("请求的url地址为： " + uri + "/api/v1/case/entrustCaseCollection?serviceCode=puhui_lend");
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=puhui_lend",
                baseVo, EntrustCaseResultVo.class);
        logger.info("响应信息为: " + result.getMessage());
        assertEquals(result.getMessage(),"案件委托成功");
    }
}