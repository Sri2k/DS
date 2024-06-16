export class Recursion_Example
{
    print1ton(count: number, n: number): void
    {
        if (count > n)
        {
            return;
        }
        console.log(count);
        this.print1ton(count + 1, n)
    }
}