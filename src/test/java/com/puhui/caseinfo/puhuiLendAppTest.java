package com.puhui.caseinfo;

import com.puhui.Service.impl.RepayCaseManageServiceImpl;
import com.puhui.Service.impl.RepayDepartmentServiceImpl;
import com.puhui.repay.cloud.api.enumerate.RelationShip;
import com.puhui.repay.cloud.api.vo.*;
import com.puhui.utils.TestData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @ClassName puhuiLendAppTest
 * @Description 测试个贷App案件入案
 * @Author JiaZhang
 * @Date 2018/6/19 上午10:36
 * @Version 1.0
 **/
@SpringBootTest
@TestPropertySource("classpath:config.properties")
public class puhuiLendAppTest extends AbstractTestNGSpringContextTests {

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
    public void PUHUI_LEND_APP_GEDAIAPP_Test(){

        BaseVo baseVo = testData.getBaseVo("LEND");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("gedaiAPP");
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=puhui_lend_app",
                baseVo, EntrustCaseResultVo.class);
        assertEquals(result.getMessage(),"案件委托成功");
    }

    @Test
    public void PUHUI_LEND_APP_1001_Test(){

        BaseVo baseVo = testData.getBaseVo("LEND");
        repayCaseManageService.UpdateStatus(baseVo.getCaseVo().getCoreRequestId().toString());
        baseVo.getCaseVo().setProductName("1001");
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=puhui_lend_app",
                baseVo, EntrustCaseResultVo.class);
        assertEquals(result.getMessage(),"案件委托成功");
    }

    @Test
    public void entrustCasePrepaymentTest(){
        Date d = new Date();
        CustomerVo CustomerVo = new CustomerVo();
        CustomerVo.setBankcard("6111111111116666666");
        CustomerVo.setBankPhone("13910527756");
        CustomerVo.setCompanyAddress("CompanyAddressTest");
        CustomerVo.setCompanyName("CompanyNameTest");
        CustomerVo.setCoreCustomerId(366660L);
        CustomerVo.setDepartment("DepartmentTest");
        CustomerVo.setEducateLevel("本科");
        CustomerVo.setEntryDate(d);
        CustomerVo.setHouseAddress("HouseAddressTest");
        CustomerVo.setHukouAddress("HukouAddressTest");
        CustomerVo.setIdNo("360781199407155864");
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
        CustomerVo.setUserName("林招招");
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
        CaseVo.setContractCode("218121295886669996223");
        CaseVo.setCoreRequestId(387146L);
        CaseVo.setLoanAmount(20000.00);
        CaseVo.setLoanPurpose("取现");
        CaseVo.setPassTime(d);
        CaseVo.setProductName("qianzhan");
        CaseVo.setRequestId(4998623L);
        CaseVo.setSalespeople("SalespeopleTest");
        CaseVo.setSeller(244L);
        CaseVo.setSellerName("SellerNameTest");
        CaseVo.setSellGroup(400L);
        CaseVo.setSellGroupName("一组");
        CaseVo.setSignedAmount(22000.00);
        CaseVo.setStoreProvince("东莞分部");
        CaseVo.setSubmiter(1L);
        CaseVo.setSubmiterName("SubmiterNameTest");
        CaseVo.setIsDeposit(false);
        CaseVo.setLoanChannelType("LoanChannelTypeTest");
        CaseVo.setShopName("涅槃");
        CaseVo.setSignedDate(d);

        BaseVo baseVo = new BaseVo();
        baseVo.setCaseVo(CaseVo);
        baseVo.setCustomerVo(CustomerVo);
        List<ContactPhoneVo> list_p = new ArrayList<>();
        list_p.add(ContactPhoneVo1);
        baseVo.setContactPhoneVoList(list_p);

        EntrustCaseResultVo result = restTemplate.postForObject(
                "http://puhui-repay-cloud-server.chome.beta/api/v1/case/entrustCaseCollection?serviceCode=puhui_lend",
                baseVo, EntrustCaseResultVo.class);
//        log.info("响应信息为： " + result.getMessage());
        Assert.assertEquals(result.getMessage(),"案件委托成功");
    }
}