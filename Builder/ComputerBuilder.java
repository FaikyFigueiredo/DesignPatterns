public class ComputerBuilder {
    Computer comp;

    public ComputerBuilder(){
        comp = new Computer();
    }
    public ComputerBuilder setGPU(String gpu){
        comp.GPU = gpu;
        return this;
    }
    public ComputerBuilder setCPU(String cpu){
        comp.CPU = cpu;
        return this;
    }
    public ComputerBuilder setPower(float power){
        comp.power = power;
        return this;
    }
    public ComputerBuilder setRAM(float ram){
        comp.RAM = ram;
        return this;
    }
    public ComputerBuilder setStorage(float storage){
        comp.Storage = storage;
        return this;
    }
    public Computer build(){
        return comp;
    }
}
