import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class Personagem{

    //Elementos
    private String id,name,house,ancestry,species,patronus,actorName,eyeColour,hairColor,gender;
    private ArrayList<String> alternate_names;
    private boolean hogwartsStudent,hogwartsStaff,alive,wizard;
    private Date dateOfBirth;
    private int yearOfBirth;

    //Construtores
    public Personagem() {
        this.id = "";
        this.name = "";
        this.ancestry = "";
        this.species = "";
        this.patronus = "";
        this.actorName = "";
        this.eyeColour = "";
        this.hairColor = "";
        this.gender = "";
        this.house = "";
        this.yearOfBirth = 0;
        this.alternate_names = new ArrayList<String>();
    }

    public Personagem(String id, String name, String house, String ancestry, String species,
                      String patronus, String actorName, String eyeColour, String hairColor,
                      String gender, ArrayList<String> alternate_names, boolean hogwartsStudent,
                      boolean hogwartsStaff, boolean alive, boolean wizard, Date dateOfBirth,
                      int yearOfBirth) {
        this.id = id;
        this.name = name;
        this.house = house;
        this.ancestry = ancestry;
        this.species = species;
        this.patronus = patronus;
        this.actorName = actorName;
        this.eyeColour = eyeColour;
        this.hairColor = hairColor;
        this.gender = gender;
        this.alternate_names = alternate_names;
        this.hogwartsStudent = hogwartsStudent;
        this.hogwartsStaff = hogwartsStaff;
        this.alive = alive;
        this.wizard = wizard;
        this.dateOfBirth = dateOfBirth;
        this.yearOfBirth = yearOfBirth;
    }
    //Função Get
    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getHouse(){
        return this.house;
    }
    public String getAncestry(){
        return this.ancestry;
    }
    public String getSpecies(){
        return this.species;
    }
    public String getPatronus(){
        return this.patronus;
    }
    public String getActorname(){
        return this.actorName;
    }
    public String getEyeColour(){
        return this.eyeColour;
    }
    public String getHairColor(){
        return this.hairColor;
    }
    public String getGender(){
        return this.gender;
    }
    public ArrayList<String> getAlternateNames(){
        return this.alternate_names;
    }
    public boolean getHogwartsStudent(){
        return this.hogwartsStudent;
    }
    public boolean getHogwartsStaff(){
        return this.hogwartsStaff;
    }
    public boolean getAlive(){
        return this.alive;
    }
    public boolean getWizard(){
        return this.wizard;
    }
    public int getYear(){
        return this.yearOfBirth;
    }
    public Date getDate(){
        return this.dateOfBirth;
    }

    //Função Set
    public void setId(String id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setHouse(String housename){
        this.house=housename;
    }
    public void setAncestry(String ancestry){
        this.ancestry = ancestry;
    }
    public void setSpecies(String species){
        this.species = species;
    }
    public void setPatronus(String patronus){
        this.patronus = patronus;
    }
    public void setActorName(String name){
        this.actorName = name;
    }
    public void setEyeColor(String color){
        this.eyeColour = color;
    }
    public void setHairColor(String color){
        this.hairColor = color;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setAlternateNames(ArrayList<String> names){
        this.alternate_names = names;
    }
    public void setHogwartsStudent(boolean isStudent){
        this.hogwartsStudent = isStudent;
    }
    public void setHogwartsStaff(boolean haveStaff){
        this.hogwartsStaff = haveStaff;
    }
    public void setAlive(boolean isAlive){
        this.alive = isAlive;
    }
    public void setWizard(boolean isWizard){
        this.wizard = isWizard;
    }
    public void setYear(int newYear){
        this.yearOfBirth = newYear;
    }
    public void setDate(Date newDate){

        this.dateOfBirth = newDate;
    }

    //Função clone
    public void clone(Personagem newClone){
        newClone.setYear(this.getYear());
        newClone.setDate(this.getDate());   
        newClone.setHogwartsStaff(this.getHogwartsStaff());
        newClone.setAlive(this.getAlive());
        newClone.setWizard(this.getWizard());
        newClone.setGender(this.getGender());
        newClone.setAlternateNames(this.getAlternateNames());
        newClone.setGender(this.getGender());
        newClone.setHogwartsStudent(this.getHogwartsStudent());
        newClone.setHairColor(this.getHairColor());
        newClone.setEyeColor(this.getEyeColour());
        newClone.setPatronus(this.getPatronus());
        newClone.setSpecies(this.getSpecies());
        newClone.setAncestry(this.getAncestry());
        newClone.setHouse(this.getHouse());
        newClone.setName(this.getName());
        newClone.setId(this.getId());

    }

    //Função imprimir
    public void imprimir(){
        String arrayPrintado = "{";
        if(!this.getAlternateNames().isEmpty()){
            for(int i = 0; i<this.getAlternateNames().size(); i++){
                arrayPrintado+=this.getAlternateNames().get(i);
                if (i < this.getAlternateNames().size()- 1) {
                    arrayPrintado += ", ";
                }
            }
        }

        arrayPrintado+= "}";
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        String dataFormatada = "";
        if (this.getDate() != null) {
            dataFormatada = formato.format(this.getDate());
        } else {
            dataFormatada = "Data não disponível";
        }
        System.out.println("["+this.getId()+ " ## "+ this.getName()+ " ## "+arrayPrintado+ " ## "+this.getHouse()+ " ## "+this.getAncestry()+ " ## "+this.getSpecies()+ " ## "+this.getPatronus()+ " ## "+this.getHogwartsStaff()+ " ## "+this.getHogwartsStudent()+ " ## "+this.getActorname()+ " ## "+this.getAlive()+ " ## "+dataFormatada+ " ## "+this.getYear()+ " ## "+this.getEyeColour()+ " ## "+this.getGender()+ " ## "+this.getHairColor()+ " ## "+this.getWizard()+"]");
    }


    //Função Ler
    public void ler(String id){
        String path = "/tmp/characters.csv";
        try{
            File dados = new File(path);
            Scanner sc = new Scanner(dados);
    
            if(sc.hasNextLine()){
                sc.nextLine();
            }
            
            while(sc.hasNextLine()){
                String linha = sc.nextLine();
                int p = 0;
                while(linha.charAt(p) != '['){
                    p++;
                }
                int j = p;
                while(linha.charAt(j) != ']'){
                    j++;
                }
                int ind = p;
                int end = j;
    
                String[] colunas = linha.split(";");
    
                if(colunas.length>0 && colunas[0].equals(id)){
                    this.setId(colunas[0]);
                    this.setName(colunas[1]);
                    this.setHouse(colunas[3]);
                    this.setAncestry(colunas[4]);
                    this.setSpecies(colunas[5]);
                    this.setPatronus(colunas[6]);
                    // Convertendo para minúsculas antes de comparar
                    this.setHogwartsStaff(colunas[7].toLowerCase().equals("verdadeiro"));
                    this.setHogwartsStudent(colunas[8].toLowerCase().equals("verdadeiro"));
                    this.setActorName(colunas[9]);
                    this.setAlive(colunas[10].toLowerCase().equals("verdadeiro"));
                    SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
                    try {
                        this.setDate(formato.parse(colunas[12]));
                    } catch (ParseException e) {
                        System.err.println("Formato de data inválido.");
                    }
                    this.setYear(Integer.parseInt(colunas[13]));
                    this.setEyeColor(colunas[14]);
                    this.setGender(colunas[15]);
                    this.setHairColor(colunas[16]);
                    // Convertendo para minúsculas antes de comparar
                    this.setWizard(colunas[17].toLowerCase().equals("verdadeiro"));
    
                    String nomesAlternativos = colunas[2];
                    String nomes[] = nomesAlternativos.split(",");
    
                    for(int n = 0; n< nomes.length; n++){
                        if(nomes[n].length() > 0){
                            if(nomes[n].charAt(0) == ' '){
                                String aux = "";
                                for(int x = 0; x<nomes[n].length()-1; x++){
                                    aux += nomes[n].charAt(x+1);
                                }
                                nomes[n] = aux;
                            }
                            if(nomes[n].charAt(0) == '['){
                                String aux = "";
                                for(int x = 0; x<nomes[n].length()-1; x++){
                                    aux += nomes[n].charAt(x+1);
                                }
                                nomes[n] = aux;
                            }
                            if(nomes[n].charAt(nomes[n].length()-1) == ']'){
                                String aux = "";
                                for(int x = 0; x<nomes[n].length()-1; x++){
                                    aux += nomes[n].charAt(x);
                                }
                                nomes[n] = aux;
                            }
                            if(nomes[n].length() > 0 && nomes[n].charAt(0) == '\''){
                                String aux = "";
                                for(int x = 0; x<nomes[n].length()-1; x++){
                                    aux += nomes[n].charAt(x+1);
                                }
                                nomes[n] = aux;
                            }
                            if(nomes[n].length() > 0 && nomes[n].charAt(nomes[n].length()-1) == '\''){
                                String aux = "";
                                for(int x = 0; x<nomes[n].length()-1; x++){
                                    aux += nomes[n].charAt(x);
                                }
                                nomes[n] = aux;
                            }
                        }
                    }
                    
                    ArrayList<String> Alternativos = new ArrayList<String>();
                    for(int i = 0; i<nomes.length; i++){
                        Alternativos.add(nomes[i]);
                    }
                    this.setAlternateNames(Alternativos);
                }
            }
            sc.close();
        } catch(FileNotFoundException erro){
            erro.printStackTrace();
        }
    }
    


    //Função addName
    public void addName(String name){
        this.alternate_names.add(name);
    }
    
}
public class Q07 {

    public static boolean checkEnd(String entrada){
        boolean check = true;
        if(entrada.charAt(0) == 'F' && entrada.charAt(1) == 'I' && entrada.charAt(2) == 'M'){
            check = false;
        }
        return check;
    }

    public static boolean igual(String s1, String s2){
        boolean check = false;
        int count = 0;
        if (s1.length() == s2.length()) {
            for(int i = 0; i<s1.length();i++){
                if(s1.charAt(i) == s2.charAt(i)){
                    count++;
                }
            }
        }
        if(count == s1.length()){
            check = true;
        }
        return check;
    }

    public static Personagem[] aumentarArray(Personagem[] array, Personagem novoPersonagem){
        Personagem[] newArray = new Personagem[array.length+1];
        if(array.length != 0){
            for(int i = 0; i<array.length; i++){
                newArray[i] = array[i];
            }
        }
        newArray[array.length] = novoPersonagem;
        return newArray;
    }

    public static Personagem[] ordenarcaoInsercao(Personagem[] registro){
        int comparacoes = 0; // Contador para o número de comparações realizadas
        int movimentacoes = 0; // Contador para o número de movimentações (trocas) realizadas
        
        // Início da medição do tempo
        long startTime = System.nanoTime();

        for (int i = 1; i < registro.length; i++){
			Personagem tmp = registro[i];
            int j = i - 1;

            while ((j >= 0) && (compararData(registro[j], tmp))){
                comparacoes++; //Incrementa o contador de comparações
                movimentacoes++;  //Incrementa o contador de movimentações para a operação de troca
                
                registro[j + 1] = registro[j];
                j--;
            }
            registro[j + 1] = tmp;
            movimentacoes++;  //Incrementa o contador de movimentações para a operação de troca
        }

        // Fim da medição do tempo
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000000; // Tempo em milissegundos

        // Escrever informações no arquivo de log
        escreverLog(comparacoes, movimentacoes, duration);

        return registro;
	}

    public static void escreverLog(int comparacoes, int movimentacoes, long tempoExecucao) {
        String matricula = "811197"; 
        String nomeArquivo = "matrícula_insercao.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(nomeArquivo))) {
            writer.println(matricula + "\t" + comparacoes + "\t" + movimentacoes + "\t" + tempoExecucao);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean compararData(Personagem data1, Personagem data2){
        
        if(data1.getDate().compareTo(data2.getDate()) > 0){
            return true;
        }
        if(data1.getDate().compareTo(data2.getDate()) == 0){
            //se as datas forem iguais compara os nomes
            if(data1.getName().compareTo(data2.getName()) > 0 ){
                return true;
            }
            else{
                return false;
            }
        }
        else {
            return false;
        }
        
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Personagem[] registros = new Personagem[0];
        int n = 0;
        String id = sc.nextLine();
        while(checkEnd(id)){
            Personagem teste = new Personagem();
            teste.ler(id);
            registros = aumentarArray(registros,teste);
            n++;
            id = sc.nextLine();
        }
        sc.close();

        //ordenar arrey
        registros = ordenarcaoInsercao(registros);

        //imprimir registros
        int x = 0;
        while ( x < registros.length) {
            registros[x].imprimir();
            x++;
        }
    }
}
