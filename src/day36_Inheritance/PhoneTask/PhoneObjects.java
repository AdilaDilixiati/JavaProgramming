package day36_Inheritance.PhoneTask;

public class PhoneObjects {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        iphone.setInfo("Apple", "large", "golden", "13ProMax", 2000);
        iphone.call(789008987);
        iphone.text(778333444);
        iphone.faceTime(604565998);
        iphone.faceTime("MyName@gmail.com");

        System.out.println(iphone);

        Samsung samsung = new Samsung();
        samsung.setInfo("Samsung", "medium", "black", "S20", 1500);
        samsung.call(604999333);
        samsung.text(888922111);
        samsung.freeze();

        System.out.println(samsung);

        Nokia nokia = new Nokia();
        nokia.setInfo("Nokia", "small", "silver", "N96", 800);
        nokia.call(778555222);
        nokia.text(604333999);
        nokia.selfDefense();

        System.out.println(nokia);


    }
}
