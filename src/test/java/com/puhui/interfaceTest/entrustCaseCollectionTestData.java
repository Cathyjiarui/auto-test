package com.puhui.interfaceTest;

import com.puhui.repay.cloud.api.vo.BaseVo;
import com.puhui.utils.ConstantData;
import com.puhui.utils.TestData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.testng.annotations.DataProvider;

import java.lang.reflect.Method;
import java.util.*;

/**
 * @ClassName entrustCaseCollectionTestData
 * @Description 测试数据组装
 * @Author JiaZhang
 * @Date 2018/11/30 6:55 PM
 * @Version 1.0
 **/
@SpringBootTest
@TestPropertySource("classpath:config.properties")
public class entrustCaseCollectionTestData {

    @DataProvider(name = "entrustCaseCollection")
    public Iterator<Object []> entrustCaseCollectionData(Method method){

        /**
         * 声明返回值初始值
         */
        List<Object> item = new ArrayList<>();
        List<Object []> reslus = new ArrayList<>();
        TestData testData = new TestData();

        if(method.getName().equals("puhui_lend_test")){
            Map<String,String> channels = new HashMap<>();
            channels.put(ConstantData.PUHUI_LEND_GEDAI, ConstantData.LEND);
            channels.put(ConstantData.PUHUI_LEND_1000,ConstantData.LEND);
            for(Map.Entry<String,String> entry : channels.entrySet()){
                BaseVo baseVo = testData.getBaseVo(entry.getValue());
                baseVo.getCaseVo().setProductName(entry.getKey());
                item.add(baseVo);
            }
        }else if(method.getName().equals("puhui_lend_app_test")){
            Map<String,String> channels = new HashMap<>();
            channels.put(ConstantData.PUHUI_LEND_APP_GEDAIAPP,ConstantData.LEND);
            channels.put(ConstantData.PUHUI_LEND_APP_1001,ConstantData.LEND);
            for(Map.Entry<String,String> entry : channels.entrySet()){
                BaseVo baseVo = testData.getBaseVo(entry.getValue());
                baseVo.getCaseVo().setProductName(entry.getKey());
                item.add(baseVo);
            }
        }else if(method.getName().equals("jiea_online_test")){
            Map<String,String> channels = new HashMap<>();
            channels.put(ConstantData.JIEA_ONLINE_0,ConstantData.JA_H5);
            channels.put(ConstantData.JIEA_ONLINE_1,ConstantData.JA_H5);
            channels.put(ConstantData.JIEA_ONLINE_2,ConstantData.JA_QCZJ);
            channels.put(ConstantData.JIEA_ONLINE_3,ConstantData.JA_51XYK);
            channels.put(ConstantData.JIEA_ONLINE_4,ConstantData.JA_WX);
            channels.put(ConstantData.JIEA_ONLINE_5,ConstantData.JA_JDQ);
            channels.put(ConstantData.JIEA_ONLINE_6,ConstantData.JA_H5);
            channels.put(ConstantData.JIEA_ONLINE_7,ConstantData.JA_H5);
            channels.put(ConstantData.JIEA_ONLINE_9,ConstantData.JA_JLM);
            channels.put(ConstantData.JIEA_ONLINE_999,ConstantData.JA_H5);
            channels.put(ConstantData.JIEA_ONLINE_10,ConstantData.JA_SSJ);
            channels.put(ConstantData.JIEA_ONLINE_11,ConstantData.JA_WC);
            channels.put(ConstantData.JIEA_ONLINE_12,ConstantData.JR_SD);
            channels.put(ConstantData.JIEA_ONLINE_17,ConstantData.JA_H5_KNYSX);
            channels.put(ConstantData.JIEA_ONLINE_1002,ConstantData.JA_APP);
            channels.put(ConstantData.JIEA_ONLINE_19,ConstantData.JA_WCYSX);
            channels.put(ConstantData.JIEA_ONLINE_21,ConstantData.RONG_360);
            channels.put(ConstantData.JIEA_ONLINE_18,ConstantData.JA_H5);
            channels.put(ConstantData.JIEA_ONLINE_23,ConstantData.JA_YY);
            channels.put(ConstantData.JIEA_ONLINE_22,ConstantData.JA_YM);
            channels.put(ConstantData.JIEA_ONLINE_25,ConstantData.JA_DFW);
            channels.put(ConstantData.JIEA_ONLINE_26,ConstantData.JA_H5);
            channels.put(ConstantData.JIEA_ONLINE_24,ConstantData.JA_H5);
            for(Map.Entry<String,String> entry : channels.entrySet()){
                BaseVo baseVo = testData.getBaseVo(entry.getValue());
                switch (entry.getKey()){
                    case "0":
                        baseVo.getCaseVo().setProductName("卡牛");
                        baseVo.getCaseVo().setChannelId(1L);
                        break;
                    case "1":
                        baseVo.getCaseVo().setProductName("普惠(app1.5)");
                        baseVo.getCaseVo().setChannelId(2L);
                        break;
                    case "2":
                        baseVo.getCaseVo().setProductName("汽车之家");
                        baseVo.getCaseVo().setChannelId(3L);
                        break;
                    case "3":
                        baseVo.getCaseVo().setProductName("51信用卡");
                        baseVo.getCaseVo().setChannelId(4L);
                        break;
                    case "4":
                        baseVo.getCaseVo().setProductName("微信");
                        baseVo.getCaseVo().setChannelId(5L);
                        break;
                    case "5":
                        baseVo.getCaseVo().setProductName("借点钱");
                        baseVo.getCaseVo().setChannelId(6L);
                        break;
                    case "6":
                        baseVo.getCaseVo().setProductName("openline(app2.0)");
                        baseVo.getCaseVo().setChannelId(7L);
                        break;
                    case "7":
                        baseVo.getCaseVo().setProductName("大搜车");
                        baseVo.getCaseVo().setChannelId(8L);
                        break;
                    case "9":
                        baseVo.getCaseVo().setProductName("借了吗");
                        baseVo.getCaseVo().setChannelId(9L);
                        break;
                    case "10":
                        baseVo.getCaseVo().setProductName("随手记");
                        baseVo.getCaseVo().setChannelId(12L);
                        break;
                    case "11":
                        baseVo.getCaseVo().setProductName("挖财");
                        baseVo.getCaseVo().setChannelId(13L);
                        break;
                    case "12":
                        baseVo.getCaseVo().setProductName("闪贷");
                        baseVo.getCaseVo().setChannelId(14L);
                        break;
                    case "17":
                        baseVo.getCaseVo().setProductName("卡牛预授信");
                        baseVo.getCaseVo().setChannelId(15L);
                        break;
                    case "1002":
                        baseVo.getCaseVo().setProductName("钱站转售资易通");
                        baseVo.getCaseVo().setChannelId(20L);
                        break;
                    case "19":
                        baseVo.getCaseVo().setProductName("挖财预授信");
                        baseVo.getCaseVo().setChannelId(22L);
                        break;
                    case "21":
                        baseVo.getCaseVo().setProductName("融360");
                        baseVo.getCaseVo().setChannelId(23L);
                        break;
                    case "18":
                        baseVo.getCaseVo().setProductName("钱站小额短期");
                        baseVo.getCaseVo().setChannelId(31L);
                        break;
                    case "23":
                        baseVo.getCaseVo().setProductName("云油");
                        baseVo.getCaseVo().setChannelId(32L);
                        break;
                    case "22":
                        baseVo.getCaseVo().setProductName("亿美");
                        baseVo.getCaseVo().setChannelId(33L);
                        break;
                    case "25":
                        baseVo.getCaseVo().setProductName("大富翁");
                        baseVo.getCaseVo().setChannelId(37L);
                        break;
                    case "26":
                        baseVo.getCaseVo().setProductName("聚信立");
                        baseVo.getCaseVo().setChannelId(38L);
                        break;
                    case "24":
                        baseVo.getCaseVo().setProductName("FF");
                        baseVo.getCaseVo().setChannelId(39L);
                        break;
                        default:
                            baseVo.getCaseVo().setProductName("卡牛");
                            baseVo.getCaseVo().setChannelId(1L);
                }
                item.add(baseVo);
            }
        }else if(method.getName().equals("puhui_shanjie_test")){
            Map<String,String> channels = new HashMap<>();
            channels.put(ConstantData.PUHUI_SHANJIE_SUPERLOAN_OFFLINE,ConstantData.SJ);
            channels.put(ConstantData.PUHUI_SHANJIE_SUPERLOAN_ONLINE,ConstantData.SJ);
            channels.put(ConstantData.PUHUI_SHANJIE_SUPERLOAN_CONSUME,ConstantData.SJ);
            for(Map.Entry<String,String> entry : channels.entrySet()){
                BaseVo baseVo = testData.getBaseVo(entry.getValue());
                baseVo.getCaseVo().setProductName(entry.getKey());
                item.add(baseVo);
            }
        }else if(method.getName().equals("puhui_renmai_p2p_test")){
            Map<String,String> channels = new HashMap<>();
            channels.put(ConstantData.PUHUI_RENMAI_P2P_HM_P2P,ConstantData.RM_COSMESTIC);
            for(Map.Entry<String,String> entry : channels.entrySet()){
                BaseVo baseVo = testData.getBaseVo(entry.getValue());
                baseVo.getCaseVo().setProductName(entry.getKey());
                item.add(baseVo);
            }
        }else if(method.getName().equals("puhui_renmai_wenzhou_test")){
            Map<String,String> channels = new HashMap<>();
            channels.put(ConstantData.PUHUI_RENMAI_WENZHOU_HM_WZ,ConstantData.RM_WZCB);
            channels.put(ConstantData.PUHUI_RENMAI_WENZHOU_HM_WZ_BUYBACK,ConstantData.RM_WZCB);
            for(Map.Entry<String,String> entry : channels.entrySet()){
                BaseVo baseVo = testData.getBaseVo(entry.getValue());
                baseVo.getCaseVo().setProductName(entry.getKey());
                item.add(baseVo);
            }
        }else if(method.getName().equals("finup_fancard_test")){
            Map<String,String> channels = new HashMap<>();
            channels.put(ConstantData.FINUP_FANCARD_FANCARD,ConstantData.FAN_CARD);
            for(Map.Entry<String,String> entry : channels.entrySet()){
                BaseVo baseVo = testData.getBaseVo(entry.getValue());
                baseVo.getCaseVo().setProductName(entry.getKey());
                item.add(baseVo);
            }
        }else if(method.getName().equals("finup_qianzhan_pb_test")){
            Map<String,String> channels = new HashMap<>();
            channels.put(ConstantData.FINUP_QIANZHAN_PB_QIANZHANPB,ConstantData.JA_QZ_SUPER);
            for(Map.Entry<String,String> entry : channels.entrySet()){
                BaseVo baseVo = testData.getBaseVo(entry.getValue());
                baseVo.getCaseVo().setProductName(entry.getKey());
                item.add(baseVo);
            }
        }

        for (Object u : item){
            reslus.add(new Object[] {u});
        }
        return reslus.iterator();
    }
}