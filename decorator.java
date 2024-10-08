public abstract class decorator implements grade {
    protected grade Grade;
        public decorator(grade Grade) {
            this.Grade = Grade; 
        }
        public abstract void grade();
        

}