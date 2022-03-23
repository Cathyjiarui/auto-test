package com.puhui.interfaceTest;

import com.puhui.Service.impl.RepayCaseManageServiceImpl;
import com.puhui.repay.cloud.api.vo.BaseVo;
import com.puhui.repay.cloud.api.vo.EntrustCaseResultVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

/**
 * @ClassName entrustCaseCollectionTest
 * @Description 入案接口测试
 * @Author JiaZhang
 * @Date 2018/11/30 10:45 AM
 * @Version 1.0
 **/
@SpringBootTest
@TestPropertySource("classpath:config.properties")
public class entrustCaseCollectionTest extends AbstractTestNGSpringContextTests {

    private static final Logger LOGGER = LoggerFactory.getLogger(entrustCaseCollectionTest.class);

    @Autowired
    private RepayCaseManageServiceImpl repayCaseManageService;

    @Autowired
    private OAuth2RestTemplate restTemplate;

    @Value("${entrustCaseCollection.uri}")
    private String uri;

    @Test(description = "测试个贷案件入案", dataProviderClass = entrustCaseCollectionTestData.class, dataProvider = "entrustCaseCollection")
    public void puhui_lend_test(BaseVo baseVo){
        LOGGER.info("测试的渠道为" + baseVo.getCaseVo().getProductName());
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=puhui_lend",
                baseVo, EntrustCaseResultVo.class);
        assertEquals("案件委托成功", result.getMessage());
    }

    @Test(description = "测试个贷App案件入案", dataProviderClass = entrustCaseCollectionTestData.class, dataProvider = "entrustCaseCollection")
    public void puhui_lend_app_test(BaseVo baseVo){
        LOGGER.info("测试的渠道为" + baseVo.getCaseVo().getProductName());
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        EntrustCaseResultVo result = restTemplate.postForObject(
          uri + "/api/v1/case/entrustCaseCollection?serviceCode=puhui_lend_app",
                baseVo,EntrustCaseResultVo.class);
        assertEquals("案件委托成功", result.getMessage());
    }

    @Test(description = "测试钱站案件入案", dataProviderClass = entrustCaseCollectionTestData.class, dataProvider = "entrustCaseCollection")
    public void jiea_online_test(BaseVo baseVo){
        LOGGER.info("测试的渠道为" + baseVo.getCaseVo().getProductName());
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=jiea_online",
                baseVo,EntrustCaseResultVo.class);
        assertEquals("案件委托成功", result.getMessage());
    }

    @Test(description = "测试闪借案件入案", dataProviderClass = entrustCaseCollectionTestData.class, dataProvider = "entrustCaseCollection")
    public void puhui_shanjie_test(BaseVo baseVo){
        LOGGER.info("测试的渠道为" + baseVo.getCaseVo().getProductName());
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=puhui_shanjie",
                baseVo,EntrustCaseResultVo.class);
        assertEquals("案件委托成功", result.getMessage());
    }

    @Test(description = "测试任买P2P案件入案", dataProviderClass = entrustCaseCollectionTestData.class, dataProvider = "entrustCaseCollection")
    public void puhui_renmai_p2p_test(BaseVo baseVo){
        LOGGER.info("测试的渠道为" + baseVo.getCaseVo().getProductName());
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=puhui_renmai_p2p",
                baseVo,EntrustCaseResultVo.class);
        assertEquals("案件委托成功", result.getMessage());
    }

    @Test(description = "测试任买温州银行案件入案", dataProviderClass = entrustCaseCollectionTestData.class, dataProvider = "entrustCaseCollection")
    public void puhui_renmai_wenzhou_test(BaseVo baseVo){
        LOGGER.info("测试的渠道为" + baseVo.getCaseVo().getProductName());
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=puhui_renmai_wenzhou",
                baseVo,EntrustCaseResultVo.class);
        assertEquals("案件委托成功", result.getMessage());
    }

    @Test(description = "测试钒卡案件入案", dataProviderClass = entrustCaseCollectionTestData.class, dataProvider = "entrustCaseCollection")
    public void finup_fancard_test(BaseVo baseVo){
        LOGGER.info("测试的渠道为" + baseVo.getCaseVo().getProductName());
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=finup_fancard",
                baseVo,EntrustCaseResultVo.class);
        assertEquals("案件委托成功", result.getMessage());
    }

    @Test(description = "测试钱站PB案件入案", dataProviderClass = entrustCaseCollectionTestData.class, dataProvider = "entrustCaseCollection")
    public void finup_qianzhan_pb_test(BaseVo baseVo) {
        LOGGER.info("测试的渠道为" + baseVo.getCaseVo().getProductName());
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=finup_qianzhan_pb",
                baseVo,EntrustCaseResultVo.class);
        assertEquals("案件委托成功", result.getMessage());
    }
}