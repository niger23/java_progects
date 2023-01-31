package Seminars.Seminar010;

public class JSON {
    public static <T> String Marshal(T obj) {
        if (obj instanceof Worker) {
            Worker w = (Worker) obj;
            return String.format("{\n\t\"id\": %d,\n\t\"name\": \"%s\"\n}", w.getId(), w.getName());
        } else if (obj instanceof String) {
            String s = (String) obj;
            return String.format("\"%s\"", s);
        } else if (obj instanceof Integer) {
            Integer d = (Integer) obj;
            return String.format("%d",d);
        }
        return "";
    }
    public static Object UnMarshal(String json) {
        if (json.contains("{")) {
            String[] res = json.replaceAll("[{}\"\n]", "").split("[,:]");
            return new Worker(Integer.parseInt(res[1].trim()), res[3].trim());
        } else if (json.contains("\"") && !json.contains("{")) {
            return json.replace("\"", "");
        } else {
            return Integer.parseInt(json);
        }
    }
    
}
