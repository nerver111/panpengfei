package com.example.demo;
import com.example.demo.enums.CompanyType;

import java.math.BigDecimal;

/**
 * @author panpengfei
 * @date 2020/8/5
 */

public class Profit {
    public static void main(String[] args) {
        select(CompanyType.YANGHE_GUFEN);
    }

    public static void select(CompanyType type){
        switch (type){
            case SHANGHAI_JICHANG:
                calculation(new BigDecimal("0.66"),new BigDecimal("71"),new BigDecimal("0.19").subtract(new BigDecimal("0.03")));
                break;
            case GONGSHANG_YINHANG:
                calculation(new BigDecimal("0.2628"),new BigDecimal("5"),new BigDecimal("0.05").subtract(new BigDecimal("0.03")));
                break;
            case LIZHU_JITUAN:
                calculation(new BigDecimal("1.1501"),new BigDecimal("53.27"),new BigDecimal("0.2").subtract(new BigDecimal("0.03")));
                break;
            case WANKE:
                calculation(new BigDecimal("1.0166"),new BigDecimal("28.60"),new BigDecimal("0.18").subtract(new BigDecimal("0.03")));
                break;
            case XINYE_YINHANG:
                calculation(new BigDecimal("0.762"),new BigDecimal("17.35"),new BigDecimal("0.06").subtract(new BigDecimal("0.03")));
                break;
            case SANDONG_YAOPO:
                calculation(new BigDecimal("0.3"),new BigDecimal("54.82"),new BigDecimal("0.3").subtract(new BigDecimal("0.03")));
                break;
            case MAIRUI_YILIAO:
                calculation(new BigDecimal("1.5"),new BigDecimal("267"),new BigDecimal("0.3").subtract(new BigDecimal("0.03")));
                break;
            case ZHONGGUO_PINGAN:
                calculation(new BigDecimal("2.1"),new BigDecimal("76.54"),new BigDecimal("0.25").subtract(new BigDecimal("0.03")));
                break;
            case LEPU_YILIAO:
                calculation(new BigDecimal("0.2"),new BigDecimal("35.41"),new BigDecimal("0.32").subtract(new BigDecimal("0.03")));
                break;
            case LONGJI_GUFEN:
                calculation(new BigDecimal("0.38"),new BigDecimal("71"),new BigDecimal("1").subtract(new BigDecimal("0.03")));
                break;
            case HUALAN_SHENGWU:
                calculation(new BigDecimal("0.4"),new BigDecimal("50"),new BigDecimal("0.2").subtract(new BigDecimal("0.03")));
                break;
            case SHANGHAI_JIAHUA:
                calculation(new BigDecimal("0.25"),new BigDecimal("40"),new BigDecimal("0.05").subtract(new BigDecimal("0.03")));
                break;
            case GUOXING_GUANDIAN:
                calculation(new BigDecimal("0.3"),new BigDecimal("11.63"),new BigDecimal("0.1").subtract(new BigDecimal("0.03")));
                break;
            case KELAI_JIDIAN:
                calculation(new BigDecimal("0.171"),new BigDecimal("36"),new BigDecimal("0.4").subtract(new BigDecimal("0.03")));
                break;
            case HANGFA_DONGLI:
                calculation(new BigDecimal("0.144"),new BigDecimal("64.75"),new BigDecimal("0.4").subtract(new BigDecimal("0.03")));
                break;
            case HAILUO_SHUINI:
                calculation(new BigDecimal("2.12"),new BigDecimal("47.08"),new BigDecimal("0.2883"));
            case GELI_DIANQI:
                calculation(new BigDecimal("3"),new BigDecimal("46.10"),new BigDecimal("0.0963"));
            case ZHONGGUO_JIANZHU:
                calculation(new BigDecimal("0.2147"),new BigDecimal("4.89"),new BigDecimal("0.1221"));
            case YANGHE_GUFEN:
                calculationRetrofit("3","198","0.0935");
            default:
        }
    }

    /**
     * 计算每年的分红，以及分红回本需要的时间
     * @param iniValue 当年的分红金额
     * @param cost 分红前一天的买入价格
     * @param growth 5年的平均增长率
     */
    public static void calculationRetrofit(String iniValue,String cost,String growth){
        calculation(new BigDecimal(iniValue),new BigDecimal(cost),new BigDecimal(growth));
    }

    public static void calculation(BigDecimal iniValue,BigDecimal cost,BigDecimal growth){
        BigDecimal a = iniValue;
        BigDecimal c = iniValue;
        int i = 0;
        while (true){
            BigDecimal b = a.add(a.multiply(growth));
            System.out.println("b --------->" + b);
            c = c.add(b);
            a = a.add(a.multiply(growth));
            System.out.println("chiyou :" + (i+2) +"nian，fenhong : " + c);
            i++;
            if(c.compareTo(cost) > 0){
                break;
            }
        }

    }

}
