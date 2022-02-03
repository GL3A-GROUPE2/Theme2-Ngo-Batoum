class Montre{
 int heure, min;
 Personne p; // pour 2.3
 Montre(int h, int m){
 this.heure = h;
 this.min = m;
 }
 Montre(Montre m){
 this.heure = m.heure;
 this.min = m.min;
 }
 void avance(){
 if(this.min==59){
 if(this.heure == 23) this.heure = 0;
 else this.heure = this.heure++;
 this.min = 0;
 }
 else this.min++;
 }
 public static void main(String[] toto){
 Montre m = new Montre(13,45);
 Montre n = new Montre(m);
 }
}
class Personne{
 String nom;
 Montre m;
 Personne(String nom){
 this.nom = nom;
 this.m = null;
 }
 boolean porteMontre(Montre m){
 if(m.p!=null && this.m==null){
 this.m = m;
 m.p = this; // pour 2.3
 return true;
 }
 else return false; 
 }
 Montre enleveMontre(){
 Montre m = this.m;
 this.m = null;
 if(m!=null) m.p=null; // pour 2.3
 return m;
 }
 String donneHeure(){
 if(this.m != null) return this.m.heure+"h"+this.m.min;
 else return "";
 }
}