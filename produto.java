public class produto{
    String nome;
    float preço;
    int quantidade;
    
    public produto(String nome, float preço, int quantidade){
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
        pubic String getnome(){
            return nome;
        }
        public void setnome(String nome){
            this.nome = nome
        }
        public float getpreço(){
            return preço;
        }
        public float setpreço(){
            this.preço = preço
        }
        public int getquantidade(){
            return quantidade;
        }
        public float setquantidade(){
            this.quantidade = quantidade;
        }
        
        
    }
}
