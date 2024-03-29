package com.example.demo.enums;

/**
 * @author panpengfei
 * @date 2021/1/27
 */

public enum CompanyType {
    SHANGHAI_JICHANG("1","上海机场"),
    GONGSHANG_YINHANG("2","工商银行"),
    LIZHU_JITUAN("3","丽珠集团"),
    WANKE("4","万科"),
    XINYE_YINHANG("5","兴业银行"),
    SANDONG_YAOPO("6","山东药坡"),
    MAIRUI_YILIAO("7","迈瑞医疗"),
    ZHONGGUO_PINGAN("8","中国平安"),
    LEPU_YILIAO("9","乐普医疗"),
    LONGJI_GUFEN("10","隆基股份"),
    HUALAN_SHENGWU("11","华兰生物"),
    SHANGHAI_JIAHUA("12","上海家化"),
    GUOXING_GUANDIAN("13","国星光电"),
    KELAI_JIDIAN("14","克来机电"),
    HANLAN_HUANJING("16","翰蓝环境"),
    HAILUO_SHUINI("17","海螺水泥"),
    GELI_DIANQI("18","格力电器"),
    ZHONGGUO_JIANZHU("19","中国建筑"),
    YANGHE_GUFEN("20","洋河股份"),
    HANGFA_DONGLI("99","航发动力");

    private String type;
    private String name;

    CompanyType(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
