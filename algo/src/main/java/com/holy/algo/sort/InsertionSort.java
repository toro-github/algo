package com.holy.algo.sort;

import java.util.Comparator;

/**
 * Insertion sort - start from first element and compare next element till -
 * zero element, and swap if it is smaller. - and then move onto the next
 * element until end.
 * 
 * @author ali
 * 
 */
public class InsertionSort {

	// use natural order and Comparable interface
	public static void sort(Comparable[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) {
				exch(a, j, j - 1);
			}
		}
	}

	// use a custom order and Comparator interface
	public static void sort(Object[] a, Comparator c) {
		int N = a.length;
		for (int i = 0; i < N; i++) {
			for (int j = i; j > 0 && less(c, a[j], a[j - 1]); j--) {
				exch(a, j, j - 1);
			}
		}
	}

	private static boolean less(Comparable v, Comparable w) {
		return (v.compareTo(w) < 0);
	}

	private static boolean less(Comparator c, Object v, Object w) {
		return (c.compare(v, w) < 0);
	}

	private static void exch(Object[] a, int i, int j) {
		Object swap = a[i];
		a[i] = a[j];
		a[j] = a[i];
	}

	public static boolean isSorted(Comparable[] a) {
		return isSorted(a, 0, a.length);
	}

	public static boolean isSorted(Comparable[] a, int lo, int hi) {
		for (int i = lo + 1; i <= hi; i++)
			if (less(a[i], a[i - 1]))
				return false;
		return true;
	}
	
	public static void print(Comparable[] a){
		for(int i=0; i<a.length; i++){
			System.out.println(a[i]);
		}
	}
}
