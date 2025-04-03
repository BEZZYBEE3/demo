import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Fruits from './component/comp.jsx'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <Fruits></Fruits>
    </>
  )
}

export default App
