package com.puhui.caseinfo;

import com.puhui.Service.impl.RepayCaseManageServiceImpl;
import com.puhui.Service.impl.RepayDepartmentServiceImpl;
import com.puhui.repay.cloud.api.vo.BaseVo;
import com.puhui.repay.cloud.api.vo.EntrustCaseResultVo;
import com.puhui.utils.TestData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

/**
 * @ClassName puhuiRenmaiWenzhouTest
 * @Description TODO
 * @Author JiaZhang
 * @Date 2019/1/2 10:43 AM
 * @Version 1.0
 **/
@SpringBootTest
@TestPropertySource("classpath:config.properties")
public class puhuiRenmaiWenzhouTest extends AbstractTestNGSpringContextTests {

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
    public void PUHUI_RENMAI_WENZHOU_HM_WZ_Test(){

        BaseVo baseVo = testData.getBaseVo("RM_WZCB");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("HM_WZ");
        baseVo.getCaseVo().setStoreId(repayDepartmentService.getUcOrgId(baseVo.getCaseVo().getStoreName()).getUcOrgId());
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=puhui_renmai_wenzhou",
                baseVo, EntrustCaseResultVo.class);
        assertEquals(result.getMessage(),"案件委托成功");
    }

    @Test
    public void PUHUI_RENMAI_WENZHOU_HM_WZ_BUYBACK_Test(){

        BaseVo baseVo = testData.getBaseVo("RM_WZCB");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("HM_WZ_BUYBACK");
        baseVo.getCaseVo().setStoreId(repayDepartmentService.getUcOrgId(baseVo.getCaseVo().getStoreName()).getUcOrgId());
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=puhui_renmai_wenzhou",
                baseVo, EntrustCaseResultVo.class);
        assertEquals(result.getMessage(),"案件委托成功");
    }
}
