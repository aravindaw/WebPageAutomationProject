package com.viewQwest.app.enums;

public enum DataPlans {
    Gamer_Bundle("1Gbps Raptor Gamer Bundle"),
    FiberBundle_2GB("2Gbps Fibre Broadband Bundle"),
    FiberBundle_1GBMonthly("1Gbps Fibre Broadband Bundle - Monthly"),
    FiberBundle_1GBAnnual("1Gbps Fibre Broadband Bundle - Annual");
//    Bundle_2GBAnnual("2Gbps Bundle - Annual");

    private String plan;

    DataPlans(String plan) {
        this.plan = plan;
    }

    public String getPlan() {
        return plan;
    }

    @Override
    public String toString() {
        return plan;
    }
}

