class Fibonacci

	# returns the nth Fibonacci number
	# complexity: O(N)
	def self.fib_num(nth)
		return 1 if nth < 3
		two_previous, one_previous = 1, 1
		current = nil
		(nth - 2).times do
		  current = two_previous + one_previous
		  two_previous = one_previous
		  one_previous = current
	  end
	  current
	end

  # returns the nth Fibonacci number
  # complexity: O(2^N)
	def self.bad_fib_num(nth)
	  return 1 if nth < 3
	  return bad_fib_num(nth - 2) + bad_fib_num(nth - 1)
	end
	
end

if ARGV.count == 0
  puts "Usage: ruby fibonacci.rb <number> [<number>...]"
else
  ARGV.each do |n|
    num = n.to_i
    puts "\n#{num}th Fibonacci number:"
    puts "Fast: #{Fibonacci.fib_num(num)}"
    puts "Slow: #{Fibonacci.bad_fib_num(num)}"
  end
  puts
end
