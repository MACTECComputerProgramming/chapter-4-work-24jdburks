/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;




public class RockPaperScissor {

    public static void main(String[] args) {
        Random num = new Random();
        int randomNum = num.nextInt(4);
        System.out.println(randomNum);

    }
}
