
    package homeWork4;

    public enum PROFF {
        WORKER(2),
        DIRECTOR(4),
        STAGGER (1);
        private int koef;


        PROFF(int koef){
            this.koef = koef;
        }

        public int getKoef(){
            return koef;
        }}
