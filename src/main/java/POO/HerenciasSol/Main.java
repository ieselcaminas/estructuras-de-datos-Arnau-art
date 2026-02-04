package POO.HerenciasSol;

public class Main {
    public static void main(String[] args) {
        Religion Cristianismo = new Religion("Cristiansmo", "1 D.C");
        Libro Biblia = new Libro("Biblia", Cristianismo);
        Sacerdote sacerdotecris = new Sacerdote(Cristianismo,"Pablo","42");
        sacerdotecris.añadir();
        Templo templocris = new Templo("Notre Dame",Cristianismo,"Estilo gótico");
        Templo templocris2 = new Templo("la catedral del mar", Cristianismo,"Estilo romano");
        sacerdotecris.creer();

        /*----------------------------------------------------------------------------------------------------------*/
        Religion Islam = new Religion("Islam","610 D.C");
        Libro AlQuran = new Libro("Al Quran", Islam);

        Sacerdote sacerdoteislam = new Sacerdote(Islam,"Mohamed","32");
        sacerdoteislam.añadir();
        Templo temploisl = new Templo("Taj Mahal", Islam,"Islamico-mongol");
        Templo temploisl2 = new Templo("Mezquita azul", Islam,"Arquitectura otomana");
        sacerdoteislam.creer();
        /*----------------------------------------------------------------------------------------------------------*/
        Religion Taoismo = new Religion("Taoismo", "IV A.C");
        Libro TaoTei = new Libro("Tao Tei", Taoismo);

        Sacerdote sacerdotetao = new Sacerdote(Taoismo,"Kinkangxong","31");
        sacerdotetao.añadir();
        Templo templot= new Templo("Templo del Cielo", Taoismo,"ceremonial / clásico chino");
        Templo templot2= new Templo("Monte Qingcheng", Taoismo, "Clásico chino / Taoísta");
        sacerdotetao.creer();
        /*----------------------------------------------------------------------------------------------------------*/






    }
}
