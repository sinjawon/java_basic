package oop.enum_;

public class Developer {
    private  String name;
    private  int career;
    //렝귀지라는 이넘타입으로 변경한다
   // private String lang;
   private  Language lang;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCareer() {
        return career;
    }

    public void setCareer(int career) {
        this.career = career;
    }

    public Language getLang() {
        return lang;
    }

    public void setLang(Language lang) {
        this.lang = lang;
    }
}
