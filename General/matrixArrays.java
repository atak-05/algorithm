
public class matrixArrays {
    public static void main(String[] args) {
        Object [][] complexList = {{1,"Cenk",1.83,true}, {2, "Gizem",null, true} ,{3,"Atak",1.67,null }, {4,"Bıdık"} };
        
        for (int i = 0; i<complexList.length; i++) {
            for (int j = 0; j<complexList[i].length; j++) {
                System.out.print(complexList[i][j]+ "\t");
            }
            System.out.println("");
        }
    
    }
}
