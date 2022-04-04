
package ObjetosPredefinidos;

import Comida.Comida;
import com.mycompany.proyecto_1.Mascotas.Mascota;
import com.mycompany.proyecto_1.Mascotas.MascotaHibrida1;
import com.mycompany.proyecto_1.Mascotas.MascotaHibrida2;


public class MascotasPredefinidas {
    
    Mascota [] mascotasTier1 =new Mascota[9];
    Mascota [] mascotasTier2 =new Mascota[8];
    //son 11 mascotas, pero una puede invocar 2 cuando muere 
    Mascota [] mascotasTier3 =new Mascota[13];
    Mascota [] mascotasTier4 =new Mascota[8];
    Mascota [] mascotasTier5 =new Mascota[8];
    Mascota [] mascotasTier6 =new Mascota[9];
    Mascota [] mascotasTier7 =new Mascota[3];
    /*
    Comida [] comidasTier1 = new Comida [2];*/
    
    public MascotasPredefinidas() {
        /*ComidasPredefinidas comidas = new ComidasPredefinidas();
        comidasTier1 = comidas.comidasTier1;*/
        

    }
    
    //devolvera un arreglo con las mascotas creadas
    public Mascota[] generarMascotasTier1(){
       
        MascotaHibrida1 hormiga = new MascotaHibrida1("terrestre", "Hormiga", 2, 1, 0, 0, "insecto", 1, 0, 1);
        MascotaHibrida1 pescado = new MascotaHibrida1("","Pescado", 2, 3, 0, 0, "acuatico", 1, 0, 1);
        MascotaHibrida1 mosquito = new MascotaHibrida1("", "Mosquito", 2, 2, 0, 0, "volador", 1, 0, 1);
        MascotaHibrida1 grillo = new MascotaHibrida1("","Grillo", 1, 2, 0, 0, "insecto", 1, 0, 1);
        MascotaHibrida1 grilloZombie = new MascotaHibrida1("","Grillo Zombie", 1, 1, 0, 0, "insecto", 1, 0, 1);
        MascotaHibrida1 castor = new MascotaHibrida1("acuatico", "Castor", 2, 2, 0, 0, "terrestre", 1, 0, 1);
        MascotaHibrida1 caballo = new MascotaHibrida1("domestico", "Caballo", 2, 1, 0, 0, "mamifero", 1, 0, 1);
        Mascota nutria = new Mascota("Nutria", 1, 2, 0, 0, "insecto", 1, 0, 1);
        Mascota escarabajo = new Mascota("Escarabajo", 2, 3, 0, 0, "insecto", 1, 0, 1);
        mascotasTier1[0] = hormiga;
        mascotasTier1[1] = pescado;
        mascotasTier1[2] = mosquito;
        mascotasTier1[3] = grillo;
        mascotasTier1[4] = castor;
        mascotasTier1[5] = caballo;
        mascotasTier1[6] = nutria;
        mascotasTier1[7] = escarabajo;
        mascotasTier1[8] = grilloZombie;
        //hay una posicion extra para el grillo Zombie invocado indice = 8
        return mascotasTier1;
    }
    
    //devolvera un arreglo con las mascotas creadas
    public Mascota [] generarMascotasTier2(){
    
        MascotaHibrida1 sapo = new MascotaHibrida1("acuatico", "Sapo", 3, 3, 0, 0, "terrestre", 1, 0, 1);
        Mascota dodo = new Mascota("Dodo", 2, 3, 0, 0, "volador", 1, 0, 1);
        MascotaHibrida1 elefante = new MascotaHibrida1("terrestre", "Elefante", 3, 5, 0, 0, "mamifero", 1, 0, 1);
        MascotaHibrida1 puercoEspin = new MascotaHibrida1("terrestre", "Puerco Espin", 3, 2, 0, 0, "solitario", 1, 0, 1);
        MascotaHibrida1 pavoreal = new MascotaHibrida1("volador", "Pavoreal", 2, 5, 0, 0, "domestico", 1, 0, 1);
        MascotaHibrida1 rata = new MascotaHibrida1("solitario", "Rata", 4, 5, 0, 0, "terrestre", 1, 0, 1);
        MascotaHibrida1 zorro = new MascotaHibrida1("terrestre", "Zorro", 5, 2, 0, 0, "solitario", 1, 0, 1);
        Mascota araña = new Mascota("Araña", 2, 2, 0, 0, "insecto", 1, 0, 1);
        mascotasTier2[0]= sapo;
        mascotasTier2[1]= dodo;
        mascotasTier2[2]= elefante;
        mascotasTier2[3]= puercoEspin;
        mascotasTier2[4]= pavoreal;
        mascotasTier2[5]= rata;
        mascotasTier2[6]= zorro;
        mascotasTier2[7]= araña;
        return mascotasTier2;
    }
    
    public Mascota [] generarMascotasTier3(){
         MascotaHibrida1 camello = new MascotaHibrida1("desertico", "Camello", 2, 5, 0, 0, "mamifero", 3, 0, 1); 
         Mascota mapache = new Mascota("Mapache", 5, 4, 0, 0, "solitario", 3, 0, 1);
         MascotaHibrida1 jirafa = new MascotaHibrida1("terrestre", "Jirafa", 2, 5, 0, 0, "mamifero", 3, 0, 1); 
         Mascota tortuga = new Mascota("Tortuga", 1, 2, 0, 0, "reptil", 3, 0, 1); 
         MascotaHibrida1 caracol = new MascotaHibrida1("solitario", "Caracol", 2, 2, 0, 0, "insecto", 3, 0, 1);
         MascotaHibrida1 oveja = new MascotaHibrida1("terrestre", "Oveja", 2, 2, 0, 0, "domestico", 3, 0, 1);
         Mascota conejo = new Mascota("Conejo", 3, 2, 0, 0, "mamifero", 3, 0, 1); 
         MascotaHibrida1 lobo = new MascotaHibrida1("terrestre", "Lobo", 3, 4, 0, 0, "solitario", 3, 0, 1);
         Mascota buey = new Mascota("Buey", 1, 4, 0, 0, "mamifero", 3, 0, 1); 
         MascotaHibrida1 canguro = new MascotaHibrida1("terrestre", "Canguro", 1, 2, 0, 0, "mamifero", 3, 0, 1);
         MascotaHibrida1 buho = new MascotaHibrida1("solitario", "Buho", 5, 3, 0, 0, "volador", 3, 0, 1);
         mascotasTier3[0]=camello;
         mascotasTier3[1]=mapache;
         mascotasTier3[2]=jirafa;
         mascotasTier3[3]=tortuga;
         mascotasTier3[4]=caracol;
         mascotasTier3[5]=oveja;
         mascotasTier3[6]=conejo;
         mascotasTier3[7]=lobo;
         mascotasTier3[8]=buey;
         mascotasTier3[9]=canguro;
         mascotasTier3[10]=buho;
         return mascotasTier3;
         
    }
    //agregar las habilidades de cada mascota abajo!!!!!!!!!!!!!!!!!!!
    public Mascota [] generarMascotasTier4(){
         Mascota venado = new Mascota("Venado", 1, 1, 0, 0, "mamifero", 4, 0, 1);
         Mascota loro = new Mascota("Loro", 5, 3, 0, 0, "volador", 4, 0, 1);
         MascotaHibrida1 hipopotamo = new MascotaHibrida1("terrestre", "Hipopotamo", 4, 7, 0, 0, "acuatico", 4, 0, 1);
         Mascota delfin = new Mascota("Delfin", 4, 6, 0, 0, "acuatico", 4, 0, 1);
         MascotaHibrida1 puma = new MascotaHibrida1("terrestre", "Puma", 3, 7, 0, 0, "mamifero", 4, 0, 1);
         Mascota ballena  = new Mascota("Ballena", 3, 8, 0, 0, "acuatico", 4, 0, 1);
         Mascota ardilla = new Mascota("Ardilla", 2, 5, 0, 0, "domestico", 4, 0, 1);
         Mascota llama = new Mascota("Llama", 3, 6, 0, 0, "terrestre", 4, 0, 1);
         mascotasTier4[0] = venado;
         mascotasTier4[1] = loro;
         mascotasTier4[2] = hipopotamo;
         mascotasTier4[3] =delfin;
         mascotasTier4[4] = puma;
         mascotasTier4[5] = ballena;
         mascotasTier4[6] = ardilla;
         mascotasTier4[7] = llama;
         return mascotasTier4;
         
    }
    
    public Mascota [] generarMascotasTier5(){
        
        MascotaHibrida1 foca = new MascotaHibrida1("mamifero", "Foca", 3, 8, 0, 0, "acuatico", 5, 0, 1);
        MascotaHibrida1 jaguar = new MascotaHibrida1("terrestre", "Jaguar", 7, 4, 0, 0, "mamifero", 5, 0, 1);
        MascotaHibrida1 escorpion = new MascotaHibrida1("solitario", "Escorpion", 1, 1, 0, 0, "desertico", 5, 0, 1);
        MascotaHibrida1 rinoceronte  = new MascotaHibrida1("terrestre", "Rinoceronte", 5, 8, 0, 0, "desertico", 5, 0, 1);
        Mascota mono = new Mascota("Mono", 1, 2, 0, 0, "mamifero", 5, 0, 1);
        MascotaHibrida1 cocodrilo  = new MascotaHibrida1("solitario", "cocodrilo", 8, 4, 0, 0, "reptil", 5, 0, 1);
        MascotaHibrida1 vaca  = new MascotaHibrida1("terrestre", "Vaca", 4, 6, 0, 0, "mamifero", 5, 0, 1);
        MascotaHibrida1 chompipe  = new MascotaHibrida1("volador", "Chompipe", 3, 4, 0, 0, "terrestre", 5, 0, 1);
        mascotasTier5[0]= foca;
        mascotasTier5[1]= jaguar;
        mascotasTier5[2]= escorpion;
        mascotasTier5[3]= rinoceronte;
        mascotasTier5[4]= mono;
        mascotasTier5[5]= cocodrilo;
        mascotasTier5[6]= vaca;
        mascotasTier5[7]= chompipe;
        return mascotasTier5;
      
    }
    public Mascota [] generarMascotasTier6(){
        
        MascotaHibrida1 panda = new MascotaHibrida1("solitario", "Panda", 5, 5, 0, 0, "mamifero", 6, 0, 1);
        MascotaHibrida1 gato = new MascotaHibrida1("mamifero", "Gato", 4, 5, 0, 0, "domestico", 6, 0, 1);
        MascotaHibrida1 tigre = new MascotaHibrida1("mamifero", "Tigre", 4, 3, 0, 0, "terrestre", 6, 0, 1);
        MascotaHibrida2 serpiente  = new MascotaHibrida2("reptil", "terrestre", "Serpiente", 6, 6, 0, 0, "desertico", 6, 0, 0);
        MascotaHibrida2 mamut  = new MascotaHibrida2("mamifero", "terrestre", "Mamut", 3, 10, 0, 0, "solitario", 6, 0, 0);
        MascotaHibrida1 leopardo  = new MascotaHibrida1("mamifero", "Leopardo", 10, 4, 0, 0, "terrestre", 6, 0, 1);
        MascotaHibrida1 gorila  = new MascotaHibrida1("mamifero", "Gorila", 6, 9, 0, 0, "terrestre", 6, 0, 1);
        MascotaHibrida1 pulpo  = new MascotaHibrida1("acuatico", "Pulpo", 8, 8, 0, 0, "solitario", 6, 0, 1);
        MascotaHibrida1 mosca  = new MascotaHibrida1("volador", "Mosca", 5, 5, 0, 0, "insecto", 6, 0, 1);
        mascotasTier6[0]= panda;
        mascotasTier6[1]= gato;
        mascotasTier6[2]= tigre;
        mascotasTier6[3]= serpiente;
        mascotasTier6[4]= mamut;
        mascotasTier6[5]= leopardo;
        mascotasTier6[6]= gorila;
        mascotasTier6[7]= pulpo;
        mascotasTier6[8]= mosca;
        return mascotasTier6;
      
    }
    
    public Mascota [] generarMascotasTier7(){
     
        MascotaHibrida1 quetzal  = new MascotaHibrida1("volador", "Quetzal", 10, 10, 0, 0, "solitario", 7, 0, 1);
        MascotaHibrida1 camaleon  = new MascotaHibrida1("reptil", "Camaleon", 8, 8, 0, 0, "solitario", 7, 0, 1);
        return mascotasTier7;
    }
}
