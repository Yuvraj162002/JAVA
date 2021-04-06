package com.task3;

class  product {
    int price;
    String name;

    public void productdetails() {
        System.out.println("this is the best product");
    }
}

    class price extends product{
        int pr;
        public int getprice(){
            return pr;
        }
        public void setprice(int p){
            this.pr = p;
        }
}
class name extends product{
        String n;
         public String getname(){
             return n;
         }
         public void setname(String name){
             this.n = name;
         }
}



class productclass {
    public static void main(String[] args) {
        product  pro = new product();
        price  p1 = new price();
        name n = new name();

        pro.productdetails();
        p1.setprice(5678);
        System.out.println("the price of the given product is\t"+p1.getprice());

        n.setname("haldiram");
        System.out.println("the name of the product is\t"+n.getname());

    }


}
