package com.company;

class Patient {

    private String name;
    private String sickness;


    Patient(String name) {
        this(name,null);

    }

    Patient(String name, String sickness) {

        this.name = name;
        this.sickness = sickness;

    }

    boolean isSick() {
        return this.sickness != null;
    }

    String getSickness() {
        return this.sickness;
    }

    String getName() {
        return this.name;
    }

    void takeMedication(Medicine name) {
        if (isSick() && this.sickness.equals(name.getTreatmentName())) {
            this.sickness = null;
        }
    }

}

