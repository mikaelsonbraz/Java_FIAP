package cap03;

public class Construtores {

        private int numeroConta;
        private double saldoConta;

        // Construtor personalizado, criado por mimmm, que já pede os atributos no instanciamento de um novo objeto
        public Construtores(int numeroConta, double saldoConta) {
            this.numeroConta = numeroConta;
            this.saldoConta = saldoConta;
        }
        // Nesse caso o construtor padrão não mais funcionará, a não ser que declaremos ele também, sem nada dentro:
        public Construtores() {

        }

        // Os construtores também admitem sobrecarga, assim como os métodos
        public Construtores(int numeroConta) {
            this.numeroConta = numeroConta;
            this.saldoConta = 0;
        }

        // IMPORTANTE SOBRE OS CONSTRUTORES!! ELES NÃO TEM TIPO DE RETORNO, NEM MESMO VOID!!!!

        public double recuperarSaldo() {
            return saldoConta;
        }

        public void sacar(double valor) {
            if (valor > 0) {
                if (this.saldoConta >= valor) {
                    this.saldoConta -= valor;
                }
            }
        }

        public void depositar(double valor) {
            if (valor > 0) {
                this.saldoConta += valor;
            }
        }

        public int getNumConta() {
            return numeroConta;
        }

        public void setNumConta(int numero) {
            if (numero > 0) {
                this.numeroConta = numero;
            }
        }
}

