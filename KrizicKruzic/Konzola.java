package KrizicKruzic;

public class Konzola {

    private char[][] polje;

    public Konzola() {
        polje = new char[3][3];

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                polje[i][j] = ' ';
            }
        }
    }

    public void ploca() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(polje[i][j]);
                if(j < 2) {
                    System.out.print(" | ");
                }
            }
            System.out.println();
            if(i < 2) {
                System.out.println("--+---+--");
            }
        }
    }

    public boolean potez(int row, int col, char simbol) {
        if(polje[row][col] == ' ') {
            polje[row][col] = simbol;
            return true;
        }
        return false;
    }

    public boolean nerijeseno() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                if(polje[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean pobjednik(char simbol) {
        for(int i = 0; i < 3; i++) {
            if(polje[i][0] == simbol && polje[i][1] == simbol && polje[i][2] == simbol) {
                return true;
            }
        }

        for(int i = 0; i < 3; i++) {
            if(polje[0][i] == simbol && polje[1][i] == simbol && polje[2][i] == simbol) {
                return true;
            }
        }

        if(polje[0][0] == simbol && polje[1][1] == simbol && polje[2][2] == simbol) {
            return true;
        }

        if(polje[0][2] == simbol && polje[1][1] == simbol && polje[2][0] == simbol) {
            return true;
        }
        return false;
    }
}