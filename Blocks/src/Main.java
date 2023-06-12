import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(canSpell("bovia"));
    }

    public static boolean canSpell(String word) {
        if (word.length()%2 !=0 )// слова с нечетным количеством букв не составить
            return false;
        List<String[]> blocks = new ArrayList<>();//список с блоками
        blocks.add(new String[]{"BO"});
        blocks.add(new String[]{"XK"});
        blocks.add(new String[]{"DQ"});
        blocks.add(new String[]{"CP"});
        blocks.add(new String[]{"NA"});
        blocks.add(new String[]{"GT"});
        blocks.add(new String[]{"RE"});
        blocks.add(new String[]{"TG"});
        blocks.add(new String[]{"QD"});
        blocks.add(new String[]{"FS"});
        blocks.add(new String[]{"JW"});
        blocks.add(new String[]{"HU"});
        blocks.add(new String[]{"VI"});
        blocks.add(new String[]{"AN"});
        blocks.add(new String[]{"OB"});
        blocks.add(new String[]{"ER"});
        blocks.add(new String[]{"FS"});
        blocks.add(new String[]{"LY"});
        blocks.add(new String[]{"PC"});
        blocks.add(new String[]{"ZM"});
        Set<String> usedBlocks = new HashSet<>();//сет с использоваными блоками
        boolean FoundBlock = false;
        for (int i = 0; i < word.length(); i=i+2) {// берем по 2 буквы в цикл
            for (String[] block : blocks) {
                String partOfWord = word.substring(i, i + 2);// 2 буквы слова
                String blockInString = Arrays.toString(block);// перводим из списка в стронг переменную
                blockInString = blockInString.substring(1,3);// обрезаем тк появляюся []
                if (partOfWord.equalsIgnoreCase(blockInString) && !usedBlocks.contains(Arrays.toString(block))) {
                    usedBlocks.add(Arrays.toString(block));
                    FoundBlock = true;
                    break;
                }
                else
                    FoundBlock = false;
            }
            if (!FoundBlock)
                return false;
        }
        return true;
    }
}