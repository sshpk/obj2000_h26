package no.usn.forelesning8.backup;

public class MasterStudent extends Student {
    private String thesisTitle;

    public MasterStudent(String name, double score, String thesisTitle) {
        super(name, score);
        this.thesisTitle = thesisTitle;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }
}

