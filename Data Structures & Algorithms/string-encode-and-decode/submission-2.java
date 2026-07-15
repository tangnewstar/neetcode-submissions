class Solution {

    
    static String separator = "#";

    public String encode(List<String> strs) {
        if (strs == null || strs.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        List<Integer> sizes = new ArrayList<Integer>();
        for(String str: strs) {
            sizes.add(str.length());
        }
        for (Integer size: sizes) {
            sb.append(size).append(",");
        }
        sb.append(separator);
        for (String str: strs) {
            sb.append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        if (str == null || str.isEmpty()) {
            return new ArrayList();
        }

        int index = str.indexOf(separator);
        if (index < 0) {
            throw new RuntimeException("Illegal encode format");
        }
        String left = str.substring(0, index);
        String[] sizes = left.split(",");
        int currentPos = index + 1;
        List<String> result = new ArrayList();
        for (String sizeStr: sizes) {
            // empty string
            Integer size = Integer.parseInt(sizeStr);
            if (Integer.valueOf(0).equals(size)) {
                result.add("");
                continue;
            }
            String word = str.substring(currentPos, currentPos + size);
            result.add(word);
            currentPos += size;
        }
        return result;
    }
}
