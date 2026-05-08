package April2026.Stringsss;

class Compress {
    public static void main(String[] args) {
        char[] str = {'a','a','a','b','b','c'};

        Compress ob = new Compress();
        int ans = ob.compress(str);
        System.out.println(ans);
    }
    public int compress(char[] chars) {
        int write = 0;
        int i = 0;

        while(i < chars.length){
            char currChar = chars[i];
            int count = 0;

            // Count consecutive repeating characters
            while (i < chars.length && chars[i] == currChar){
                count++;
                i++;
            }

            // Write the character
            chars[write++] = currChar;

            if(count > 1){
                // Convert count to string to handle counts >= 10
                String countStr = Integer.toString(count);
                for (char c : countStr.toCharArray()){
                    chars[write++] = c;
                }
            }
        }
        return write;
    }
}