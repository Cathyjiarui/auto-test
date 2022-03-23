package com.puhui.caseinfo;

import com.puhui.bean.outsourcing.OutsourceRequestInfoResult;
import com.puhui.bean.outsourcing.OutsourcingKase;
import com.puhui.mapper.outsourcing.OutsourceRequestInfoResultMapper;
import com.puhui.mapper.outsourcing.OutsourcingKaseMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @ClassName test
 * @Description TODO
 * @Author JiaZhang
 * @Date 2019/1/9 10:42 AM
 * @Version 1.0
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
public class test extends AbstractTestNGSpringContextTests {

    @Resource
    private OutsourcingKaseMapper outsourcingKaseMapper;

    @Resource
    private OutsourceRequestInfoResultMapper outsourceRequestInfoResultMapper;

    @Test
    public void testSelect(){
        Date date = new Date();
        List<OutsourcingKase> outsourcingKases = outsourcingKaseMapper.selectList(null);
        System.out.println(outsourcingKases.size());
        outsourcingKases.forEach(v -> {
            OutsourceRequestInfoResult outsourceRequestInfoResult = new OutsourceRequestInfoResult();
            outsourceRequestInfoResult.setCreateTime(date);
            outsourceRequestInfoResult.setUpdateTime(date);
            outsourceRequestInfoResult.setCoreLendRequestId(v.getAssetRequestId());
            outsourceRequestInfoResult.setUnrepayPrincipal(BigDecimal.valueOf(1.00));
            outsourceRequestInfoResult.setSquareUpAmount(BigDecimal.valueOf(1.00));
            outsourceRequestInfoResult.setThisDueDate(date);
            outsourceRequestInfoResult.setThisPhase(1);
            outsourceRequestInfoResultMapper.insert(outsourceRequestInfoResult);
        });
    }
}
