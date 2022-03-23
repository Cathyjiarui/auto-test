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
 * @ClassName finupQianzhanPbTest
 * @Description TODO
 * @Author JiaZhang
 * @Date 2019/1/2 10:48 AM
 * @Version 1.0
 **/
@SpringBootTest
@TestPropertySource("classpath:config.properties")
public class finupQianzhanPbTest extends AbstractTestNGSpringContextTests {

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
    public void FINUP_QIANZHAN_PB_QAINZHANPB_Test(){

        BaseVo baseVo = testData.getBaseVo("JA_QZ_SUPER");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("qianzhanpb");
        baseVo.getCaseVo().setStoreId(repayDepartmentService.getUcOrgId(baseVo.getCaseVo().getStoreName()).getUcOrgId());
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=finup_qianzhan_pb",
                baseVo, EntrustCaseResultVo.class);
        assertEquals(result.getMessage(),"案件委托成功");
    }
}
