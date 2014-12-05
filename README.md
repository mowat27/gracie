# gracie

Source code from my talk at Clojure Exchange 2014...

https://skillsmatter.com/conferences/1956-clojure-exchange-2014#program

One of the great things about coming to conferences is seeing ideas you’ve heard about for real. Well, Stuart Sierra’s components and reloaded workflow have been a popular topic for a while now and I’ll use this lightning talk to bring them to life by showing you how we use them to separate concerns and streamline our development workflow.

I’ll also show how we use off the shelf components to make it easy to create a componentised website or add a database and show a few patterns I have found useful for running unit tests real fast and dealing with large volumes of data in development.

## Usage

To run the application, install [Leiningen](http://leiningen.org/) and type

```
lein run
```

## Development

For rapid development, use the REPL from the command line or via your
favorite code editor.

```
lein repl
user> (dev)
dev> (go)
```

After making code changes, reset your application's state (causing all
your modifications to be reloaded too).

```
dev> (reset)
```

Rinse and repeat.

## Copyright and License

The MIT License (MIT)

Copyright © 2014

Permission is hereby granted, free of charge, to any person obtaining a copy of
this software and associated documentation files (the "Software"), to deal in
the Software without restriction, including without limitation the rights to
use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
the Software, and to permit persons to whom the Software is furnished to do so,
subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
