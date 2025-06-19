import React from 'react';

function App() {
  return (
    <div style={{ fontFamily: 'Arial, sans-serif', maxWidth: 800, margin: '0 auto', padding: 20 }}>
      <header style={{ textAlign: 'center', marginBottom: 40 }}>
        <h1>Jane Doe</h1>
        <p>Web Developer | Designer | Programmer</p>
      </header>
      <section style={{ marginBottom: 40 }}>
        <h2>About Me</h2>
        <p>
          I am a passionate web developer with experience in building modern web applications using React, Node.js, and more. I love creating beautiful and functional user experiences.
        </p>
      </section>
      <section style={{ marginBottom: 40 }}>
        <h2>Projects</h2>
        <ul>
          <li>
            <strong>Portfolio Website</strong> - A personal website to showcase my work and skills.
          </li>
          <li>
            <strong>Todo App</strong> - A simple and intuitive todo list application built with React.
          </li>
          <li>
            <strong>Weather Dashboard</strong> - A dashboard to display weather information using a public API.
          </li>
        </ul>
      </section>
      <section>
        <h2>Contact</h2>
        <p>Email: janedoe@email.com</p>
        <p>LinkedIn: linkedin.com/in/janedoe</p>
      </section>
    </div>
  );
}

export default App;
