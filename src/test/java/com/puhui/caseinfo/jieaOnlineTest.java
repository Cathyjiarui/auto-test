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

import java.util.*;

import static org.junit.Assert.assertEquals;

/**
 * @ClassName jieaOnlineTest
 * @Description 测试借啊案件入案
 * @Author JiaZhang
 * @Date 2018/6/15 下午6:05
 * @Version 1.0
 **/
@SpringBootTest
@TestPropertySource("classpath:config.properties")
public class jieaOnlineTest extends AbstractTestNGSpringContextTests {

    /**
     * 根据渠道传入参数：
     * 卡牛(0),普惠(1),汽车之家(2),信用卡51(3),微信(4),借点钱(5),openline(6),大搜车(7),
     *月光侠(8),借了吗(9),系统渠道(999),随手记(10),挖财(11),闪贷(12),卡牛预授信(17),
     *钱站转售资易通(1002),月光侠转售资易通(1003),挖财预授信(19),融360(21),钱站小额短期(18);
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
    public void JEIA_ONLINE_0_Test(){

        BaseVo baseVo = testData.getBaseVo("JA_H5");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("卡牛");
        baseVo.getCaseVo().setChannelId(1L);
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=jiea_online",
                baseVo, EntrustCaseResultVo.class);
        assertEquals(result.getMessage(),"案件委托成功");
    }

    @Test
    public void JEIA_ONLINE_1_Test(){

        BaseVo baseVo = testData.getBaseVo("JA_H5");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("普惠(app1.5)");
        baseVo.getCaseVo().setChannelId(2L);
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=jiea_online",
                baseVo, EntrustCaseResultVo.class);
        assertEquals(result.getMessage(),"案件委托成功");
    }

    @Test
    public void JEIA_ONLINE_2_Test(){

        BaseVo baseVo = testData.getBaseVo("JA_QCZJ");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("汽车之家");
        baseVo.getCaseVo().setChannelId(3L);
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=jiea_online",
                baseVo, EntrustCaseResultVo.class);
        assertEquals(result.getMessage(),"案件委托成功");
    }

    @Test
    public void JEIA_ONLINE_3_Test(){

        BaseVo baseVo = testData.getBaseVo("JA_51XYK");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("51信用卡");
        baseVo.getCaseVo().setChannelId(4L);
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=jiea_online",
                baseVo, EntrustCaseResultVo.class);
        assertEquals(result.getMessage(),"案件委托成功");
    }

    @Test
    public void JEIA_ONLINE_4_Test(){

        BaseVo baseVo = testData.getBaseVo("JA_WX");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("微信");
        baseVo.getCaseVo().setChannelId(5L);
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=jiea_online",
                baseVo, EntrustCaseResultVo.class);
        assertEquals(result.getMessage(),"案件委托成功");
    }

    @Test
    public void JEIA_ONLINE_5_Test(){

        BaseVo baseVo = testData.getBaseVo("JA_JDQ");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("借点钱");
        baseVo.getCaseVo().setChannelId(6L);
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=jiea_online",
                baseVo, EntrustCaseResultVo.class);
        assertEquals(result.getMessage(),"案件委托成功");
    }

    @Test
    public void JEIA_ONLINE_6_Test(){

        BaseVo baseVo = testData.getBaseVo("JA_H5");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("openline(app2.0)");
        baseVo.getCaseVo().setChannelId(7L);
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=jiea_online",
                baseVo, EntrustCaseResultVo.class);
        assertEquals(result.getMessage(),"案件委托成功");
    }

    @Test
    public void JEIA_ONLINE_7_Test(){

        BaseVo baseVo = testData.getBaseVo("JA_H5");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("大搜车");
        baseVo.getCaseVo().setChannelId(8L);
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=jiea_online",
                baseVo, EntrustCaseResultVo.class);
        assertEquals(result.getMessage(),"案件委托成功");
    }

    @Test
    public void JEIA_ONLINE_9_Test(){

        BaseVo baseVo = testData.getBaseVo("JA_JLM");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("借了吗");
        baseVo.getCaseVo().setChannelId(10L);
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=jiea_online",
                baseVo, EntrustCaseResultVo.class);
        assertEquals(result.getMessage(),"案件委托成功");
    }

    @Test
    public void JEIA_ONLINE_10_Test(){

        BaseVo baseVo = testData.getBaseVo("JA_SSJ");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("随手记");
        baseVo.getCaseVo().setChannelId(12L);
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=jiea_online",
                baseVo, EntrustCaseResultVo.class);
        assertEquals(result.getMessage(),"案件委托成功");
    }

    @Test
    public void JEIA_ONLINE_11_Test(){

        BaseVo baseVo = testData.getBaseVo("JA_WC");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("挖财");
        baseVo.getCaseVo().setChannelId(13L);
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=jiea_online",
                baseVo, EntrustCaseResultVo.class);
        assertEquals(result.getMessage(),"案件委托成功");
    }

    @Test
    public void JEIA_ONLINE_12_Test(){

        BaseVo baseVo = testData.getBaseVo("JR_SD");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("闪贷");
        baseVo.getCaseVo().setChannelId(14L);
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=jiea_online",
                baseVo, EntrustCaseResultVo.class);
        assertEquals(result.getMessage(),"案件委托成功");
    }

    @Test
    public void JEIA_ONLINE_17_Test(){

        BaseVo baseVo = testData.getBaseVo("JA_H5_KNYSX");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("卡牛预授信");
        baseVo.getCaseVo().setChannelId(15L);
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=jiea_online",
                baseVo, EntrustCaseResultVo.class);
        assertEquals(result.getMessage(),"案件委托成功");
    }

    @Test
    public void JEIA_ONLINE_1002_Test(){

        BaseVo baseVo = testData.getBaseVo("JA_APP");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("钱站转售资易通");
        baseVo.getCaseVo().setChannelId(20L);
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=jiea_online",
                baseVo, EntrustCaseResultVo.class);
        assertEquals(result.getMessage(),"案件委托成功");
    }

    @Test
    public void JEIA_ONLINE_19_Test(){

        BaseVo baseVo = testData.getBaseVo("JA_WCYSX");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("挖财预授信");
        baseVo.getCaseVo().setChannelId(22L);
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=jiea_online",
                baseVo, EntrustCaseResultVo.class);
        assertEquals(result.getMessage(),"案件委托成功");
    }

    @Test
    public void JEIA_ONLINE_21_Test(){

        BaseVo baseVo = testData.getBaseVo("RONG_360");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("融360");
        baseVo.getCaseVo().setChannelId(23L);
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=jiea_online",
                baseVo, EntrustCaseResultVo.class);
        assertEquals(result.getMessage(),"案件委托成功");
    }

    @Test
    public void JEIA_ONLINE_18_Test(){

        BaseVo baseVo = testData.getBaseVo("JA_H5");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("钱站小额短期");
        baseVo.getCaseVo().setChannelId(31L);
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=jiea_online",
                baseVo, EntrustCaseResultVo.class);
        assertEquals(result.getMessage(),"案件委托成功");
    }

    @Test
    public void JEIA_ONLINE_23_Test(){

        BaseVo baseVo = testData.getBaseVo("JA_YY");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("云油");
        baseVo.getCaseVo().setChannelId(32L);
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=jiea_online",
                baseVo, EntrustCaseResultVo.class);
        assertEquals(result.getMessage(),"案件委托成功");
    }

    @Test
    public void JEIA_ONLINE_22_Test(){

        BaseVo baseVo = testData.getBaseVo("JA_YM");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("亿美");
        baseVo.getCaseVo().setChannelId(33L);
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=jiea_online",
                baseVo, EntrustCaseResultVo.class);
        assertEquals(result.getMessage(),"案件委托成功");
    }

    @Test
    public void JEIA_ONLINE_25_Test(){

        BaseVo baseVo = testData.getBaseVo("JA_DFW");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("大富翁");
        baseVo.getCaseVo().setChannelId(37L);
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=jiea_online",
                baseVo, EntrustCaseResultVo.class);
        assertEquals(result.getMessage(),"案件委托成功");
    }
}