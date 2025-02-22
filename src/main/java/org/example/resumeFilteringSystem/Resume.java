package org.example.resumeFilteringSystem;

import java.util.ArrayList;

public class Resume {
    private String candidateName;
    private int yearsOfExperience;
    private ArrayList<String> skills;
    private  Address address;

    public Resume(String candidateName, int yearsOfExperience, ArrayList<String> skills, Address address) {
        this.candidateName = candidateName;
        this.yearsOfExperience = yearsOfExperience;
        this.skills = new ArrayList<>(skills);
        this.address = address;
    }

    public String getCandidateName() {
        return candidateName;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        Resume other = (Resume) obj;
        return yearsOfExperience == other.yearsOfExperience && skills.equals(other.skills) && address.equals(other.address);
    }

    @Override
    public String toString() {
        return "Resume{" +
                "candidateName='" + candidateName + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                ", skills=" + skills +
                ", address=" + address +
                '}';
    }
}
