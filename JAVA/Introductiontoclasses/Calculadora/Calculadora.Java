public class Calculadora {
    int x;
    int y;
    float r;
    public  Calculadora (int num1, int num2, float res){
       x = num1;
       y = num2;
       r = res;
    }
       
    public float sumar (int num1, int num2){
       x = num1;
       y = num2;
       r = x + y;
       return r;
    }
    
    public float restar (int num1, int num2){
       x = num1;
       y = num2;
       r = x - y;
       return r;
    }
    
    public float multiplicar (int num1, int num2){
       x = num1;
       y = num2;
       r = x * y;
       return r;
    }
    
    public float dividir (int num1, int num2){
       x = num2;
       y = num2;
       r = x / y;
       return r;
    }
    
    public void ImpRes (){
        
        System.out.println("El resultado es " + r);
        
    }

    
    public static void main(String[] args) {
//        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));
//        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "));
        int n1 = 5;
        int n2 = 4;
        
        Calculadora Cal = new Calculadora(0,0,0);
        Cal.sumar(n1, n2);
        Cal.ImpRes();
        Cal.restar(n1, n2);
        Cal.ImpRes();
        Cal.multiplicar(n1, n2);
        Cal.ImpRes();
        Cal.dividir(n1, n2);
        Cal.ImpRes();
        
        
    }
    
}
