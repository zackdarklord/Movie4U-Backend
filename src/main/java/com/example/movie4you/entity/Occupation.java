package com.example.movie4you.entity;

public enum Occupation {
    OTHER(0, "other or not specified"),
    ACADEMIC_EDUCATOR(1, "academic/educator"),
    ARTIST(2, "artist"),
    CLERICAL_ADMIN(3, "clerical/admin"),
    COLLEGE_GRAD_STUDENT(4, "college/grad student"),
    CUSTOMER_SERVICE(5, "customer service"),
    DOCTOR_HEALTH_CARE(6, "doctor/health care"),
    EXECUTIVE_MANAGERIAL(7, "executive/managerial"),
    FARMER(8, "farmer"),
    HOMEMAKER(9, "homemaker"),
    K12_STUDENT(10, "K-12 student"),
    LAWYER(11, "lawyer"),
    PROGRAMMER(12, "programmer"),
    RETIRED(13, "retired"),
    SALES_MARKETING(14, "sales/marketing"),
    SCIENTIST(15, "scientist"),
    SELF_EMPLOYED(16, "self-employed"),
    TECHNICIAN_ENGINEER(17, "technician/engineer"),
    TRADESMAN_CRAFTSMAN(18, "tradesman/craftsman"),
    UNEMPLOYED(19, "unemployed"),
    WRITER(20, "writer");

    private final int code;
    private final String description;

    Occupation(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
