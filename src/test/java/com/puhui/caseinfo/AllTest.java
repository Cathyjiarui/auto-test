package com.puhui.caseinfo;

import com.puhui.repay.cloud.api.enumerate.RelationShip;
import com.puhui.repay.cloud.api.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.*;

/**
 * @ClassName AllTest
 * @Description TODO
 * @Author JiaZhang
 * @Date 2018/11/26 10:05 PM
 * @Version 1.0
 **/
@SpringBootTest
@TestPropertySource("classpath:config.properties")
public class AllTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private OAuth2RestTemplate restTemplate;

    @Value("${entrustCaseCollection.uri}")
    private String uri;

    BaseVo[] TestCase = new BaseVo[68];

    @DataProvider(name = "testCase", parallel = true)
    public Object[][] AllTest(){
        /**
         * 渠道准备
         */
        Map<String,List<String>> channels = new HashMap<>();
        List<String> puhuiLend = new ArrayList<>(Arrays.asList("gedai","1000"));
        List<String> puhuiLendApp = new ArrayList<>(Arrays.asList("gedaiAPP","1001"));
        List<String> jieaOnline = new ArrayList<>(Arrays.asList("0","1","2","3","4","5","6","7","9","999","10","11","12",
                "17","1002","19","21","18","23","22","25","26","24"));
        List<String> puhuiShanjie = new ArrayList<>(Arrays.asList("SUPERLOAN_OFFLINE","SUPERLOAN_ONLINE","SUPERLOAN_CONSUME"));
        List<String> puhuiRenmaiP2p = new ArrayList<>(Arrays.asList("HM_P2P"));
        List<String> puhuiRenmaiWenzhou = new ArrayList<>(Arrays.asList("HM_WZ","HM_WZ_BUYBACK"));
        List<String> finupFancard = new ArrayList<>(Arrays.asList("fancard"));
        channels.put("puhui_lend",puhuiLend);
        channels.put("puhui_lend_app",puhuiLendApp);
        channels.put("jiea_online",jieaOnline);
        channels.put("puhui_shanjie",puhuiShanjie);
        channels.put("puhui_renmai_p2p",puhuiRenmaiP2p);
        channels.put("puhui_renmai_wenzhou",puhuiRenmaiWenzhou);
        channels.put("finup_fancard",finupFancard);


        List<List<String>> channelLists = new ArrayList<>();

        /**
         * 数据准备
         */
        String[] contract_code = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19",
                "20","21","22","23","24","25","26","27","28","29","30","31","32","33","34"};
        Long[] core_request_id = {270087L,454665L,201229L,312518L,78994L,20000478137L,149800L,379467L,344695L,167240L,
                179816L,538585L,374463L,167531L,415968L,431746L,392946L,217234L,165857L,155811L,432549L,151820L,223346L,
                489598L,171605L,156584L,212617L,490000L,386679L,292254L,200127L,222323L,237727L,286213L,309205L,310287L,
                1367998L,20000280468L,20000097792L};
        Long[] request_id = {378333L,606843L,271805L,434804L,78994L,1539054642651L,170018L,519641L,469389L,209440L,239060L,
                675118L,515666L,216235L,572761L,587002L,530657L,304436L,210044L,186191L,593464L,174227L,312325L,516910L,
                222165L,189745L,296086L,639498L,509885L,411601L,626243L,809339L,931001L,1425036L,2454495L,2417146L,327L,
                111100000000010000L,111100000000001000L};

        Long[] core_request_id1 = {136606L,136629L,138002L,158704L,159096L,165784L,165797L,166976L,167362L,168411L,169234L,
                169277L,171861L,172242L,172292L,172395L,180434L,181365L,181479L,182035L,183100L,185405L,186290L,186322L,
                188182L,188545L,188626L,188740L,188860L,190040L,190362L,190752L,191070L,191944L};
        Long[] request_id1 = {86533L,85584L,54548L,247162L,250145L,315262L,315349L,326708L,331172L,337531L,354933L,358077L,
                379069L,385239L,386556L,390729L,474886L,478726L,487087L,494076L,511564L,515555L,527211L,526706L,538210L,
                540306L,542083L,544306L,545707L,552206L,553663L,555597L,556370L,560948L};


        Long[] core_customer_id = {79066L, 149845L,151857L,155840L,156610L,165866L,167245L,167536L,171604L,551442L,179787L,
                199846L,200883L,211552L,215823L,220581L,221537L,235139L,265405L,279560L,284992L,300040L,300977L,302935L,
                330794L,356095L,360162L,366228L,371641L,390811L,403763L,404536L,420541L,445946L,446293L,482579L,995782L,
                1173955L,1352692L,};
        String[] id_no = {"610424197102240450",
                "360782198905066014",
                "41072519790607481X",
                "432827197504154028",
                "512532197308142729",
                "511023199001096240",
                "452502197108318457",
                "350623195911120012",
                "410328197906174076",
                "000101198709124517",
                "330621197912051613",
                "61011419860616352X",
                "460033197211230039",
                "230602197604262125",
                "522322198610101357",
                "371523198910032048",
                "410105196501132839",
                "232326198110061017",
                "410329199109090051",
                "330523198809025427",
                "510725197007076612",
                "612724198212290195",
                "140105198705190516",
                "510112195903143314",
                "450821198509074340",
                "230107197811272494",
                "450105198004130038",
                "610113198006192136",
                "430681196401260013",
                "140107197003203018",
                "372501198302156082",
                "340824198601200630",
                "450702199409244517",
                "410102198705060048",
                "360123198411160729",
                "46010319840208032X",
                "32128119791110916X",
                "41130019820323078X",
                "110108196008081234"};
        int i = 0,j = 0;
        for(Map.Entry<String,List<String>> entry : channels.entrySet()){
            List<String> channel = entry.getValue();
            for (String v : channel){
                TestCase[i] = Case(v,core_request_id[i],request_id[i],core_customer_id[i],id_no[i]);
                i++;
            }
        }

        for(Map.Entry<String,List<String>> entry : channels.entrySet()){
            List<String> channel = entry.getValue();
            for (String v : channel){
                TestCase[i] = Case(v,core_request_id1[j],request_id1[j],core_customer_id[j],id_no[j],contract_code[j]);
                i++;
                j++;
            }
        }

        for(Map.Entry<String,List<String>> entry : channels.entrySet()){
            List<String> channel = entry.getValue();
            for (String v : channel){
                List<String> channelList = new ArrayList<>();
                System.out.println("service = " + entry.getKey() + " and channel = " + v);
                channelList.add(entry.getKey());
                channelList.add(v);
                channelLists.add(channelList);
            }
        }


        return new Object[][] {{channelLists.get(0),TestCase[0]},
                {channelLists.get(0),TestCase[1]},
                {channelLists.get(1),TestCase[2]},
                {channelLists.get(1),TestCase[3]},
                {channelLists.get(2),TestCase[4]},
                {channelLists.get(2),TestCase[5]},
                {channelLists.get(3),TestCase[6]},
                {channelLists.get(3),TestCase[7]},
                {channelLists.get(4),TestCase[8]},
                {channelLists.get(4),TestCase[9]},
                {channelLists.get(5),TestCase[10]},
                {channelLists.get(5),TestCase[11]},
                {channelLists.get(6),TestCase[12]},
                {channelLists.get(6),TestCase[13]},
                {channelLists.get(7),TestCase[14]},
                {channelLists.get(7),TestCase[15]},
                {channelLists.get(8),TestCase[16]},
                {channelLists.get(8),TestCase[17]},
                {channelLists.get(9),TestCase[18]},
                {channelLists.get(9),TestCase[19]},
                {channelLists.get(10),TestCase[20]},
                {channelLists.get(10),TestCase[21]},
                {channelLists.get(11),TestCase[22]},
                {channelLists.get(11),TestCase[23]},
                {channelLists.get(12),TestCase[24]},
                {channelLists.get(12),TestCase[25]},
                {channelLists.get(13),TestCase[26]},
                {channelLists.get(13),TestCase[27]},
                {channelLists.get(14),TestCase[28]},
                {channelLists.get(14),TestCase[29]},
                {channelLists.get(15),TestCase[30]},
                {channelLists.get(15),TestCase[31]},
                {channelLists.get(16),TestCase[32]},
                {channelLists.get(16),TestCase[33]},
                {channelLists.get(17),TestCase[34]},
                {channelLists.get(17),TestCase[35]},
                {channelLists.get(18),TestCase[36]},
                {channelLists.get(18),TestCase[37]},
                {channelLists.get(19),TestCase[38]},
                {channelLists.get(19),TestCase[39]},
                {channelLists.get(20),TestCase[40]},
                {channelLists.get(20),TestCase[41]},
                {channelLists.get(21),TestCase[42]},
                {channelLists.get(21),TestCase[43]},
                {channelLists.get(22),TestCase[44]},
                {channelLists.get(22),TestCase[45]},
                {channelLists.get(23),TestCase[46]},
                {channelLists.get(23),TestCase[47]},
                {channelLists.get(24),TestCase[48]},
                {channelLists.get(24),TestCase[49]},
                {channelLists.get(25),TestCase[50]},
                {channelLists.get(25),TestCase[51]},
                {channelLists.get(26),TestCase[52]},
                {channelLists.get(26),TestCase[53]},
                {channelLists.get(27),TestCase[54]},
                {channelLists.get(27),TestCase[55]},
                {channelLists.get(28),TestCase[56]},
                {channelLists.get(28),TestCase[57]},
                {channelLists.get(29),TestCase[58]},
                {channelLists.get(29),TestCase[59]},
                {channelLists.get(30),TestCase[60]},
                {channelLists.get(30),TestCase[61]},
                {channelLists.get(31),TestCase[62]},
                {channelLists.get(31),TestCase[63]},
                {channelLists.get(32),TestCase[64]},
                {channelLists.get(32),TestCase[65]},
                {channelLists.get(33),TestCase[66]},
                {channelLists.get(33),TestCase[67]}};
    }

    public static BaseVo Case(String channel,Long coreRequestId,Long RequestId,Long coreCustomerId, String IdNo){

        Date d = new Date();
        CustomerVo customerVo = new CustomerVo();
        customerVo.setBankPhone("13644698833");
        customerVo.setBankcard("6217001020006662390");
        customerVo.setChildren(0);
        customerVo.setCompanyAddress("让胡路区龙南后龙岗");
        customerVo.setCompanyName("大庆油田有限公司物资装备总公司");
        customerVo.setCompanyPhone("13644698833");
        customerVo.setCoreCustomerId(coreCustomerId);
        customerVo.setDepartment("调运队");
        customerVo.setEducateLevel("高中或以下");
        customerVo.setEntryDate(d);
        customerVo.setHouse(0);
        customerVo.setHouseAddress("黑龙江省大庆市让胡路区");
        customerVo.setHukouAddress("黑龙江省大庆市让胡路区8-1-402");
        customerVo.setIdNo(IdNo);
        customerVo.setMaritalStatus("已婚");
        customerVo.setOpenbank("中国建设银行");
        customerVo.setOpenbankCode("105");
        customerVo.setPhone("18611226991");
        customerVo.setPhoneOpenDate(d);
        customerVo.setPhoneOwner("D座");
        customerVo.setPosition("一般正式员工");
        customerVo.setQq("31124122066");
        customerVo.setServiceId("569979");
        customerVo.setSex("男");
        customerVo.setUserName("UserName");
        customerVo.setWeibo("1223123");
        customerVo.setWeixin("23442132131");
        customerVo.setWorkingLife("10");

        ContactPhoneVo contactPhoneVo = new ContactPhoneVo();
        contactPhoneVo.setPhones(new String[] { "18611226991", "16888888888" });
        contactPhoneVo.setRelationShip(RelationShip.SELF);
        contactPhoneVo.setUserName("本人电话");

        CaseVo caseVo = new CaseVo();
        caseVo.setApplyUserStaffId(24341L);
        caseVo.setBigdataNo("BigdataNo");
        caseVo.setBusinessTransactionId("BusinessTransactionId");
        caseVo.setContractCode(IdNo);
        caseVo.setCoreRequestId(coreRequestId);
        caseVo.setCustomerPayDay(d);
        caseVo.setExtensionFlag(0);
        caseVo.setGoodsName("GoodsName");
        caseVo.setIsDeposit(true);
        caseVo.setKeepInStore(true);
        caseVo.setLoanAmount(10000.00);
        caseVo.setLoanChannelType("IQIANJIN");
        caseVo.setLoanPurpose("LoanPurpose");
        caseVo.setOrderNo("OrderNo");
        caseVo.setPassTime(d);
        caseVo.setPaymentBody("PaymentBody");
        caseVo.setProductName(channel);
        caseVo.setRequestId(RequestId);
        caseVo.setSalespeople("Salespeople");
        caseVo.setSellGroup(123L);
        caseVo.setSellGroupName("SellGroupName");
        caseVo.setSeller(234L);
        caseVo.setSellerName("SellerName");
        caseVo.setShopName("ShopName");
        caseVo.setSignedAmount(12000.00);
        caseVo.setSignedDate(d);
        caseVo.setSpecifiedGroup("SpecifiedGroup");
        caseVo.setStoreCity("beijing");
        caseVo.setStoreId(889847L);
        caseVo.setStoreName("信阳新华东路门店");
        caseVo.setStoreProvince("StoreProvince");
        caseVo.setSubmiter(555L);
        caseVo.setSubmiterName("SubmiterName");

        BaseVo baseVo = new BaseVo();
        baseVo.setCaseVo(caseVo);
        baseVo.setCustomerVo(customerVo);
        List<ContactPhoneVo> list_p = new ArrayList<>();
        list_p.add(contactPhoneVo);
        baseVo.setContactPhoneVoList(list_p);

        return baseVo;
    }

    public static BaseVo Case(String channel,Long coreRequestId,Long RequestId,Long coreCustomerId, String IdNo, String ContractCode){

        Date d = new Date();
        CustomerVo customerVo = new CustomerVo();
        customerVo.setBankPhone("13644698833");
        customerVo.setBankcard("6217001020006662390");
        customerVo.setChildren(0);
        customerVo.setCompanyAddress("让胡路区龙南后龙岗");
        customerVo.setCompanyName("大庆油田有限公司物资装备总公司");
        customerVo.setCompanyPhone("13644698833");
        customerVo.setCoreCustomerId(coreCustomerId);
        customerVo.setDepartment("调运队");
        customerVo.setEducateLevel("高中或以下");
        customerVo.setEntryDate(d);
        customerVo.setHouse(0);
        customerVo.setHouseAddress("黑龙江省大庆市让胡路区");
        customerVo.setHukouAddress("黑龙江省大庆市让胡路区8-1-402");
        customerVo.setIdNo(IdNo);
        customerVo.setMaritalStatus("已婚");
        customerVo.setOpenbank("中国建设银行");
        customerVo.setOpenbankCode("105");
        customerVo.setPhone("18611226991");
        customerVo.setPhoneOpenDate(d);
        customerVo.setPhoneOwner("D座");
        customerVo.setPosition("一般正式员工");
        customerVo.setQq("31124122066");
        customerVo.setServiceId("569979");
        customerVo.setSex("男");
        customerVo.setUserName("UserName");
        customerVo.setWeibo("1223123");
        customerVo.setWeixin("23442132131");
        customerVo.setWorkingLife("10");

        ContactPhoneVo contactPhoneVo = new ContactPhoneVo();
        contactPhoneVo.setPhones(new String[] { "18611226991", "16888888888" });
        contactPhoneVo.setRelationShip(RelationShip.SELF);
        contactPhoneVo.setUserName("本人电话");

        CaseVo caseVo = new CaseVo();
        caseVo.setApplyUserStaffId(24341L);
        caseVo.setBigdataNo("BigdataNo");
        caseVo.setBusinessTransactionId("BusinessTransactionId");
        caseVo.setContractCode(ContractCode);
        caseVo.setCoreRequestId(coreRequestId);
        caseVo.setCustomerPayDay(d);
        caseVo.setExtensionFlag(0);
        caseVo.setGoodsName("GoodsName");
        caseVo.setIsDeposit(true);
        caseVo.setKeepInStore(true);
        caseVo.setLoanAmount(10000.00);
        caseVo.setLoanChannelType("IQIANJIN");
        caseVo.setLoanPurpose("LoanPurpose");
        caseVo.setOrderNo("OrderNo");
        caseVo.setPassTime(d);
        caseVo.setPaymentBody("PaymentBody");
        caseVo.setProductName(channel);
        caseVo.setRequestId(RequestId);
        caseVo.setSalespeople("Salespeople");
        caseVo.setSellGroup(123L);
        caseVo.setSellGroupName("SellGroupName");
        caseVo.setSeller(234L);
        caseVo.setSellerName("SellerName");
        caseVo.setShopName("ShopName");
        caseVo.setSignedAmount(12000.00);
        caseVo.setSignedDate(d);
        caseVo.setSpecifiedGroup("SpecifiedGroup");
        caseVo.setStoreCity("beijing");
        caseVo.setStoreId(889847L);
        caseVo.setStoreName("信阳新华东路门店");
        caseVo.setStoreProvince("StoreProvince");
        caseVo.setSubmiter(555L);
        caseVo.setSubmiterName("SubmiterName");

        BaseVo baseVo = new BaseVo();
        baseVo.setCaseVo(caseVo);
        baseVo.setCustomerVo(customerVo);
        List<ContactPhoneVo> list_p = new ArrayList<>();
        list_p.add(contactPhoneVo);
        baseVo.setContactPhoneVoList(list_p);

        return baseVo;
    }


    @Test(dataProvider = "testCase", threadPoolSize = 5)
    public void TestCase(List<String> channel, BaseVo baseVo){

        baseVo.getCaseVo().setProductName(channel.get(1));
        EntrustCaseResultVo result = restTemplate.postForObject(
                uri + "/api/v1/case/entrustCaseCollection?serviceCode=" + channel.get(0),
                baseVo, EntrustCaseResultVo.class);
        Assert.assertEquals(result.getMessage(),"案件委托成功");
    }
}