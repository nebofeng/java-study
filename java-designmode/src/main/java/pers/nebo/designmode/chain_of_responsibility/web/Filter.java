package pers.nebo.designmode.chain_of_responsibility.web;

public interface Filter {
	void doFilter(Request request, Response response, FilterChain chain);
}
