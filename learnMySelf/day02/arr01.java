public class arr01 {
    
    public static void demo4() {
        String[] provinces = {"bankok", "chaimai", "phuket", "konkan"};
        String[] abbr = {"bkk", "chm", "phk", "kok"};
        
        String[][] provinces2 = new String[4][2];
        provinces2[0][0] = "bankok";
        provinces2[0][1] = "bkk";
        provinces2[1][0] = "chaimai";
        provinces2[1][1] = "chm";
        provinces2[2][0] = "phuket";
        provinces2[2][1] = "phk";
        provinces2[3][0] = "konkan";
        provinces2[3][1] = "kok";

        String[][] provinces3 = {
            {"bankok", "bkk"}, // 0
            {"chaimai", "chm"}, // 1
            {"phuket", "phk", "3"}, // 2
            {"konkan", "kok"} // 3
        };
        for(int i = 0; i < provinces3.length; i++) {
            for(int j = 0; j < provinces3[i].length; j++) {
                System.out.printf("provinces3[%d][%d] = %s\n", i, j, provinces3[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        demo4();
    }

}
