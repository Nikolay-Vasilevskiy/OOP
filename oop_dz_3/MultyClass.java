package oop_dz_3;
//Описать возможность построения экземпляра класса с больши́м количеством атрибутов
/*class Foo {
    *int arg1;
    *String arg2;
    *double arg3;
    *int arg4;
    *String arg5;
    *int arg6;
    *String arg7;
   *}
   *ew Foo(arg1:1);
   *new Foo(arg1:1, arg2:"qwe");
   *new Foo(arg1:1, arg7:"qwe");
   *new Foo(arg2:"qweasd", arg7:"qwe");*/
   
public class MultyClass {

    int arg1;
    String arg2;
    double arg3;
    int arg4;
    String arg5;
    int arg6;
    String arg7;
    private MultyClass(Builder builder){
        this.arg1 = builder.arg1;
        this.arg3 = builder.arg3;
        this.arg4 = builder.arg4;
        this.arg5 = builder.arg5;
        this.arg6 = builder.arg6;
        this.arg7 = builder.arg7;

    }
    public String toString(){
      //  String str = String.format("Привет - %s! Как дела %s?", "Саша", "на работе");
        return String.format(" arg1 = %d, arg2  = %s, arg3 =  %f, arg4  = %d, arg5 = %s, arg6 = %d, arg7 =  %s"
                ,arg1,arg2,arg3,arg4,arg5,arg6,arg7);
    }

    public static void main(String[] args) {
        MultyClass foo = new Builder().arg3(2.5).arg5("qwe").arg6(7).build();
        System.out.println(foo);
    }
    public static class Builder {
        int arg1;
        String arg2;
        double arg3;
        int arg4;
        String arg5;
        int arg6;
        String arg7;
        public Builder (){};
        public Builder arg1 (int arg1){
            this.arg1 = arg1;
           return this;
        }
        public Builder arg2 (String arg2){
            this.arg2 = arg2;
            return this;
        }
        public Builder arg3 (double arg3){
            this.arg3 = arg3;
            return this;
        }

        public Builder arg4 (int arg4) {
            this.arg4 = arg4;
            return this;
        }

        public Builder arg5 (String arg5) {
            this.arg5 = arg5;
            return this;
        }
        public Builder arg6 (int arg6){
            this.arg6 = arg6;
            return this;
        }
        public Builder arg7 (String arg7){
            this.arg7 = arg7;
            return this;
        }
        public MultyClass build (){
            return new MultyClass (this);
        }
    }
}
