package by.techMeSkills.hello.homeTask5.phone;

class PhonesBean implements java.io.Serializable {
    private String number;
    private String model;
    private double weight;

    PhonesBean(){
    }
    PhonesBean(String number, String model, double weight){
        this.number = number;
        this.model = model;
        new PhonesBean(number,model);
        this.weight = weight;
    }
    PhonesBean(String number, String model){
        this.number = number;
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String name){
        System.out.println("Call: "+ name);
    }
    public void receiveCall(String name, String number){
        System.out.println("NAME:"+ name + "Number: " + number);
    }

    public void sendMessages(String ... numbers){
        for(String s: numbers){
            System.out.println(s);
        }
    }



}
