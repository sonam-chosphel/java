

enum Session
{
    MORNING,AFTERNOON,EVENING,NIGHT
}



public class prog6 {
    public static void main(String[] args)
    {
        Session[] sessions = Session.values(); 
        System.out.println("all enum constants:");
        for(Session session : sessions)
        {
            System.out.println(session);
        } 
        String sessionName = "MORNING";
        Session session = Session.valueOf(sessionName);
        System.out.println("enum constant for name "+sessionName+":"+session);
        int ordinal = session.ordinal();
        System.out.println("position of enum constant :"+session+":"+ordinal);
    }
}
