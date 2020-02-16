import org.json.JSONArray;
import org.json.JSONObject;

public class App
{
    static String json = "{'pageInfo':{'pageName':'Homepage','logo':'https://www.example.com/logo.jpg'},'posts':[{'post_id':'0123456789','actor_id':'1001','author_name':'Jane Doe','post_title':'How to parse JSON in Java','comments':[],'time_of_post':'1234567890'}]}";

    public static void main(String[] args)
    {
        JSONObject obj = new JSONObject(json);
        String pageName = obj.getJSONObject("pageInfo").getString("pageName");

        System.out.println(pageName);

        JSONArray arr = obj.getJSONArray("posts");
        for (int i = 0; i < arr.length(); i++)
        {
            String post_id = arr.getJSONObject(i).getString("post_id");
            System.out.println(post_id);
        }
    }
}