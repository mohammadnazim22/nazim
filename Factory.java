package factory;

public class OSFactory {
    static public OS factoryMethod(String os){
        switch (os){
            case "Android":
                return new Android();
            case "Windows":
                return new Windows();
            case "IOS":
                return new IOS();
            default:
                throw new IllegalArgumentException("not this OS exists please provide exists OS");
        }
    }
}
