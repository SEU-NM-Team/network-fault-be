package com.anjiplus.template.gaea.business.enums;


public enum ExcelCenterStyleEnum {
    /**
     * 左对齐
     */
    LEFT((short) 1, 1, "左对齐"),
    /**
     * 右对齐
     */
    RIGHT((short) 3, 2, "右对齐"),
    /**
     * 居中
     */
    CENTER((short) 2, 0, "居中"),
    ;

    /**
     * excel居中code
     */
    private final short excelCode;

    /**
     * 在线文档居中code
     */
    private final Integer onlineExcelCode;

    /**
     * 名称
     */
    private final String name;


    public Integer getOnlineExcelCode() {
        return onlineExcelCode;
    }

    public String getName() {
        return name;
    }

    public short getExcelCode() {
        return excelCode;
    }

    ExcelCenterStyleEnum(short excelCode, Integer onlineExcelCode, String name) {
        this.excelCode = excelCode;
        this.onlineExcelCode = onlineExcelCode;
        this.name = name;
    }


    public static ExcelCenterStyleEnum getExcelCenterStyleByExcelCenterCode(short code) {
        for (ExcelCenterStyleEnum value : ExcelCenterStyleEnum.values()) {
            if (code == value.getExcelCode()) {
                return value;
            }
        }
        return CENTER;
    }

}
