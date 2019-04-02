// PART OF THE MACHINE SIMULATION. DO NOT CHANGE.

package nachos.machine;

import nachos.machine.*;

/**
 * An object that maintains Nachos runtime statistics.
 * 
 * 一个存储Nachos运行时统计的数据的类
 */

public final class Stats {
    /**
     * Allocate a new statistics object.
     * 
     * 构造方法，分配一个新的统计对象
     */
    public Stats() {
    }

    /**
     * Print out the statistics in this object.
     * 
     * 打印这个对象的统计数据
     */
    public void print() {
	System.out.println("Ticks: total " + totalTicks
			   + ", kernel " + kernelTicks
			   + ", user " + userTicks);
	System.out.println("Disk I/O: reads " + numDiskReads
			   + ", writes " + numDiskWrites);
	System.out.println("Console I/O: reads " + numConsoleReads
			   + ", writes " + numConsoleWrites);
	System.out.println("Paging: page faults " + numPageFaults
			   + ", TLB misses " + numTLBMisses);
	System.out.println("Network I/O: received " + numPacketsReceived
			   + ", sent " + numPacketsSent);
    }

    /**
     * The total amount of simulated time that has passed since Nachos
     * started.
     * 
     * Nachos的总时间
     */
    public long totalTicks = 0;
    /**
     * The total amount of simulated time that Nachos has spent in kernel mode.
     * 
     * Nachos内核模式总时间
     */
    public long kernelTicks = 0;
    /**
     * The total amount of simulated time that Nachos has spent in user mode.
     * 
     * Nachos用户模式总时间
     */
    public long userTicks = 0;

    /** The total number of sectors Nachos has read from the simulated disk.
     * 
     * Nachos从模拟磁盘读取的总扇区数
     */
    public int numDiskReads = 0;
    
    /** The total number of sectors Nachos has written to the simulated disk.
     * Nachos向模拟磁盘写入的总扇区数
     */
    public int numDiskWrites = 0;
    
    /** The total number of characters Nachos has read from the console. 
     *
     * Nachos已从控制台读取的字符总数
     */
    public int numConsoleReads = 0;
    
    /** The total number of characters Nachos has written to the console.
     * 
     *Nachos已向控制台写入的字符总数
     */
    public int numConsoleWrites = 0;
    
    /** The total number of page faults that have occurred. 
     * 
     * 发生的页错误总数 
     */
    public int numPageFaults = 0;
    
    /** The total number of TLB misses that have occurred. 
     * 
     * TLB(传输后备缓冲器)是一个内存管理单元用于改进虚拟地址到物理地址转换速度的缓存
     */
    public int numTLBMisses = 0;
    /** The total number of packets Nachos has sent to the network. 
     * 
     * Nachos发出的包的总数
     */
    public int numPacketsSent = 0;
    
    /** The total number of packets Nachos has received from the network. 
     * 
     * Nachos接受的包的总数
     */
    public int numPacketsReceived = 0;

    /**
     * The amount to advance simulated time after each user instructions is
     * executed.
     * 
     * ？
     */
    public static final int UserTick = 1;
    /**
     * The amount to advance simulated time after each interrupt enable.
     * 
     * ？
     */
    public static final int KernelTick = 10;
    /**
     * The amount of simulated time required to rotate the disk 360 degrees.
     */
    public static final int RotationTime = 500;
    /**
     * The amount of simulated time required for the disk to seek.
     */
    public static final int SeekTime = 500;
    /**
     * The amount of simulated time required for the console to handle a
     * character.
     */
    public static final int ConsoleTime = 100;
    /**
     * The amount of simulated time required for the network to handle a
     * packet.
     */
    public static final int NetworkTime = 100;
    /**
     * The mean amount of simulated time between timer interrupts.
     */
    public static final int TimerTicks = 500;
    /**
     * The amount of simulated time required for an elevator to move a floor.
     */
    public static final int ElevatorTicks = 2000;
}
