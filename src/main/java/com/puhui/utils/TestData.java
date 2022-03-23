package com.puhui.utils;

import com.google.gson.JsonObject;
import com.puhui.repay.cloud.api.enumerate.RelationShip;
import com.puhui.repay.cloud.api.vo.BaseVo;
import com.puhui.repay.cloud.api.vo.CaseVo;
import com.puhui.repay.cloud.api.vo.ContactPhoneVo;
import com.puhui.repay.cloud.api.vo.CustomerVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * @ClassName TestData
 * @Description 拼接测试数据
 * @Author JiaZhang
 * @Date 2018/10/4 下午10:25
 * @Version 1.0
 **/
@Repository
public class TestData{

    private static final Logger LOGGER = LoggerFactory.getLogger(TestData.class);

    public BaseVo getBaseVo(String channel){

        Date d = new Date();
        Map<String,String> param = new HashMap<>();
        param.put("channel",channel);
        String caseData = HttpUtils.Get("http://post-loan-test.postloan.beta/api/asset/getOverDueCase",param);
        LOGGER.info("请求响应信息为：" + caseData);
        JsonObject jsonData = DataConversion.StringToJson(caseData);
        CustomerVo CustomerVo = new CustomerVo();
        CustomerVo.setBankcard("6111111111116666666");
        CustomerVo.setBankPhone("13910527756");
        CustomerVo.setCompanyAddress("CompanyAddressTest");
        CustomerVo.setCompanyName("CompanyNameTest");
        CustomerVo.setCoreCustomerId(jsonData.get("coreLendCustomerId").getAsLong());
        CustomerVo.setDepartment("DepartmentTest");
        CustomerVo.setEducateLevel("本科");
        CustomerVo.setEntryDate(d);
        CustomerVo.setHouseAddress("HouseAddressTest");
        CustomerVo.setHukouAddress("HukouAddressTest");
        CustomerVo.setIdNo(jsonData.get("idNo").getAsString());
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
        CustomerVo.setUserName(jsonData.get("name").getAsString());
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
        CaseVo.setContractCode(jsonData.get("lendContractCode").getAsString());
        CaseVo.setCoreRequestId(jsonData.get("coreRequestId").getAsLong());
        CaseVo.setLoanAmount(jsonData.get("amount").getAsDouble());
        CaseVo.setLoanPurpose("取现");
        CaseVo.setPassTime(d);
        CaseVo.setProductName("gedai");
        CaseVo.setRequestId(jsonData.get("requestId").getAsLong());
        CaseVo.setSalespeople("SalespeopleTest");
        CaseVo.setSeller(244L);
        CaseVo.setSellerName("SellerNameTest");
        CaseVo.setSellGroup(400L);
        CaseVo.setSellGroupName("一组");
        CaseVo.setSignedAmount(jsonData.get("signedAmount").getAsDouble());
        CaseVo.setStoreProvince("东莞分部");
        CaseVo.setSubmiter(1L);
        CaseVo.setSubmiterName("SubmiterNameTest");
        CaseVo.setIsDeposit(true);
        CaseVo.setLoanChannelType("LoanChannelTypeTest");
        CaseVo.setStoreCity(jsonData.get("city").getAsString());
        CaseVo.setStoreName(jsonData.get("shopName").getAsString());
        CaseVo.setSignedDate(d);

        BaseVo baseVo = new BaseVo();
        baseVo.setCaseVo(CaseVo);
        baseVo.setCustomerVo(CustomerVo);
        List<ContactPhoneVo> list_p = new ArrayList<>();
        list_p.add(ContactPhoneVo1);
        baseVo.setContactPhoneVoList(list_p);

        return baseVo;
    }
}
