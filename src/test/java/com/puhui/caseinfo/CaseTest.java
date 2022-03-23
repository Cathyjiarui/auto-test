package com.puhui.caseinfo;

import com.puhui.repay.cloud.api.enumerate.RelationShip;
import com.puhui.repay.cloud.api.vo.*;
import com.puhui.utils.TestData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
 * @ClassName CaseTest
 * @Description TODO
 * @Author JiaZhang
 * @Date 2019/1/9 3:01 PM
 * @Version 1.0
 **/
@SpringBootTest
@TestPropertySource("classpath:config.properties")
public class CaseTest extends AbstractTestNGSpringContextTests {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestData.class);

    @Autowired
    private OAuth2RestTemplate restTemplate;

    @Value("${entrustCaseCollection.uri}")
    private String uri;

    @Test
    public void Test(){

        Date d = new Date();
        CustomerVo CustomerVo = new CustomerVo();
        CustomerVo.setBankcard("6111111111116666666");
        CustomerVo.setBankPhone("13910527756");
        CustomerVo.setCompanyAddress("CompanyAddressTest");
        CustomerVo.setCompanyName("CompanyNameTest");
        CustomerVo.setCoreCustomerId(500014L);
        CustomerVo.setDepartment("DepartmentTest");
        CustomerVo.setEducateLevel("本科");
        CustomerVo.setEntryDate(d);
        CustomerVo.setHouseAddress("HouseAddressTest");
        CustomerVo.setHukouAddress("HukouAddressTest");
        CustomerVo.setIdNo("130182193112165858");
        CustomerVo.setMaritalStatus("已婚");
        CustomerVo.setOpenbank("中国建设银行");
        CustomerVo.setOpenbankCode("105");
        CustomerVo.setPhone("13910527756");
        CustomerVo.setPhoneOpenDate(d);
        CustomerVo.setPhoneOwner("D座");
        CustomerVo.setPosition("员工");
        CustomerVo.setQq("1111111");
        CustomerVo.setServiceId("12412");
        CustomerVo.setSex("男");
        CustomerVo.setUserName("穆卉梁");
        CustomerVo.setWeibo(null);
        CustomerVo.setWeixin(null);
        CustomerVo.setWorkingLife("15");

        ContactPhoneVo ContactPhoneVo1 = new ContactPhoneVo();
        ContactPhoneVo1.setPhones(new String[] { "13910527756", "13910527756" });
        ContactPhoneVo1.setRelationShip(RelationShip.SELF);
        ContactPhoneVo1.setUserName("本人电话");

        CaseVo CaseVo = new CaseVo();
        CaseVo.setApplyUserStaffId(12L);
        CaseVo.setBigdataNo("998822");
        CaseVo.setContractCode("FRRMZABX0933395941205430475");
        CaseVo.setCoreRequestId(20001489442L);
        CaseVo.setLoanAmount(970.00);
        CaseVo.setLoanPurpose("取现");
        CaseVo.setPassTime(d);
        CaseVo.setProductName("HM_P2P");
        CaseVo.setRequestId(933395941205430475L);
        CaseVo.setSalespeople("SalespeopleTest");
        CaseVo.setSeller(244L);
        CaseVo.setSellerName("SellerNameTest");
        CaseVo.setSellGroup(400L);
        CaseVo.setSellGroupName("一组");
        CaseVo.setSignedAmount(970.00);
        CaseVo.setStoreProvince("东莞分部");
        CaseVo.setSubmiter(1L);
        CaseVo.setSubmiterName("SubmiterNameTest");
        CaseVo.setIsDeposit(false);
        CaseVo.setLoanChannelType("LoanChannelTypeTest");
        CaseVo.setShopName("任买众安");
        CaseVo.setSignedDate(d);
        CaseVo.setProductName("renmai_zhongan");

        BaseVo baseVo = new BaseVo();
        baseVo.setCaseVo(CaseVo);
        baseVo.setCustomerVo(CustomerVo);
        List<ContactPhoneVo> list_p = new ArrayList<>();
        list_p.add(ContactPhoneVo1);
        baseVo.setContactPhoneVoList(list_p);

        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=puhui_renmai_zhongan",
                baseVo, EntrustCaseResultVo.class);
        assertEquals(result.getMessage(),"案件委托成功");
    }
}
