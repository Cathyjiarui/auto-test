package com.puhui.caseinfo;

import com.puhui.repay.cloud.api.vo.RechargeRecordVo;
import com.puhui.utils.RandomCharUtil;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.web.client.RestTemplate;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName rechargeTest
 * @Description 充值测试
 * @Author JiaZhang
 * @Date 2018/12/5 11:30 AM
 * @Version 1.0
 **/
@SpringBootTest
@TestPropertySource("classpath:config.properties")
public class rechargeTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${entrustCaseCollection.posturi}")
    private String uri;

    @Test
    public void RechargeTest(){
        Date d = new Date();
        RechargeRecordVo rechargeRecordVo = new RechargeRecordVo();
        rechargeRecordVo.setAmount(new BigDecimal(50000.00));
        rechargeRecordVo.setCoreCustomerId(307287L);
        rechargeRecordVo.setCoreRequestId(317605L);
        rechargeRecordVo.setIsDeposit(false);
        rechargeRecordVo.setRechargeId(31531418L);
        rechargeRecordVo.setRechargeSource("65224321");
        rechargeRecordVo.setRechargeTime(d);
        rechargeRecordVo.setRequestId(2765413L);
        String serialnumber = "C" + RandomCharUtil.getRandomLetterChar(4) + "99999998888888";
        rechargeRecordVo.setSerialNumber(serialnumber);

        System.out.println(uri + "/api/v2/case/recharge?serviceCode=finup_qianzhan_pb");
        String results = (String) restTemplate.postForObject(
                uri + "/api/v2/case/recharge?serviceCode=finup_qianzhan_pb",rechargeRecordVo,String.class);
        System.out.println(results);
        Assert.assertTrue(results.contains("充值记录推送成功"));
    }

    @Test
    public void RechargeProTest(){
        Date d = new Date();
        RechargeRecordVo rechargeRecordVo = new RechargeRecordVo();
        rechargeRecordVo.setAmount(new BigDecimal(70000.00));
        rechargeRecordVo.setCoreCustomerId(149252L);
        rechargeRecordVo.setCoreRequestId(149206L);
        rechargeRecordVo.setIsDeposit(false);
        rechargeRecordVo.setRechargeId(35333666468L);
        rechargeRecordVo.setRechargeSource("65224321");
        rechargeRecordVo.setRechargeTime(d);
        rechargeRecordVo.setRequestId(156979L);
        String serialnumber = "C" + RandomCharUtil.getRandomLetterChar(4) + "99999998888888";
        rechargeRecordVo.setSerialNumber(serialnumber);

        String results = (String) restTemplate.postForObject(
                uri + "/api/v2/case/rechargePro?serviceCode=finup_qianzhan_pb",rechargeRecordVo,String.class);
        System.out.println(results);
        Assert.assertTrue(results.contains("充值记录入库成功"));
    }
}
